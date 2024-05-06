package com.example08;

import java.io.*;
import java.nio.file.*;
import java.util.Comparator;

public class Test {
    public static void main(String[] args) throws IOException {
        String fileName = "D:/example/from.txt";
        System.out.println("----- 创建文件 ------");
         createFile(fileName);
        System.out.println("-----  将字符串写入文件 -------");
        // \r\n在txt文本中换行
        String str =
                "白日依山尽\r\n" +
                        "黄河入海流\r\n" +
                        "欲穷千里目\r\n" +
                        "更上一层楼\r\n";
        // writeToFile(fileName, str);
        writeToFile2(fileName, str);

        System.out.println("--------- 基于基本IO流实现文件的复制 ----------");
        String toFile = "D:/example/to.txt";
         copyByIO(fileName, toFile);

        System.out.println("--------- 基于NIO实现文件的复制 ----------");
        String toFile2 = "D:/example/nio/to.txt";
         copyByNIO(fileName, toFile2);

        System.out.println("---------- 删除指定文件 -------------");
         deleteFile(toFile);

        System.out.println("---------- 遍历指定目录文件 -------------");
        String dir = "D:/example";
         walkDirectories(dir);
    }

    /**
     * 基于Path/Files实现
     * 将传入的文件绝对路径字符串转path
     * 判断path不存在，则先创建目录，创建文件
     * 文件存在，忽略操作
     */
    private static void createFile(String fileName) throws IOException {
        Path path = Path.of(fileName);
        Files.createDirectories(path.getParent());
        try{
            Files.createFile(path);
            System.out.println("文件创建成功 文件位置：" + fileName);

        }catch (FileAlreadyExistsException e){
            System.out.println("文件已存在");
        }
    }

    /**
     * 注意，传入的fileName为文件绝对路径，必须确保文件所在目录已经存在，才能通过FileOutputStream创建
     * 将字符串转字节数组，基于FileOutputStream直接写入
     */
    private static void writeToFile(String fileName, String content) throws IOException {
      byte[] buffer = content.getBytes();
      try(FileOutputStream fileOutputStream = new FileOutputStream(fileName)){
          fileOutputStream.write(buffer);
          System.out.println("成功写入");
      }catch (IOException e){
          e.printStackTrace();
      }
    }

    /**
     * 将传入的文件绝对路径字符串转path，通过Files创建文件所在目录
     * 将字符串，基于Files工具类直接写入。写入方法，文件不存在创建并写入，存在则覆盖写入
     * 字符串转字节数组再写入也可，但无意义
     */
    private static void writeToFile2(String fileName, String content) throws IOException {
        String[] lines = content.split("\r");
        try(FileOutputStream out = new FileOutputStream(fileName);
            OutputStreamWriter writer = new OutputStreamWriter(out);
            BufferedWriter bufferedWriter = new BufferedWriter(writer)) {
            for (String line : lines) {
                bufferedWriter.write(line);
                bufferedWriter.newLine();
            }
            bufferedWriter.flush();
            System.out.println("数据写入成功！文件位置：" + fileName);
        }
    }

    /**
     * 基于基本IO，以及字节数组缓冲区，复制文件
     * 打印显示循环读写循环次数
     * 正确关闭资源
     */
    private static void copyByIO(String sourceFile, String targetFile) throws IOException{
        try(InputStream input = new FileInputStream(sourceFile);
            OutputStream output = new FileOutputStream(targetFile)) {
            int size = 8;
            byte[] buffer = new byte[size];
            int length;
            int count = 0;
            while ((length = input.read(buffer) )!= -1){
                output.write(buffer,0,length);
                count++;
            }
            System.out.println(sourceFile + "->" + targetFile + " 复制成功！");
            System.out.println("字节数组缓冲区大小为" + size + "时，读写循环次数为" + count + "\n");
        }
    }

    /**
     * 基于NIO，实现文件的复制
     * 注意，判断目标为字符串，需要转为path并创建相应目录
     */
    private static void copyByNIO(String sourceFile, String targetFile) {
        Path source = Path.of(sourceFile);
        Path target = Path.of(targetFile);
        try {
            Files.createDirectories(target.getParent());
            Files.createFile(target);
            Files.copy(source,target, StandardCopyOption.REPLACE_EXISTING);
        } catch (IOException e) {
            e.printStackTrace();
            System.err.println("Failed to copy file: " + e.getMessage());
        }
        finally {
            System.out.println(sourceFile + " -> " + targetFile + " 复制成功！\n");
        }
    }

    /**
     * 删除文件
     */
    private static void deleteFile(String fileName) throws IOException{
        Path dir = Paths.get(fileName);
        Files.deleteIfExists(dir);
        System.out.println(fileName + " 删除成功！\n");

    }

    /**
     * 遍历打印指定目录下全部目录/文件名称
     * 尝试改变正逆序操作方法
     */
    private static void walkDirectories(String dir) throws IOException{
        Path d = Paths.get(dir);
        Files.walk(d)
                .sorted(Comparator.reverseOrder())
                .forEach(System.out::println);
    }
}
