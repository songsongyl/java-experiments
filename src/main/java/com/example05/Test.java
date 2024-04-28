package com.example05;

import com.example05.entity.College;
import com.example05.entity.Student;
import com.example05.entity.Teacher;
import com.example05.resource.DatabaseUtils;

import java.util.List;
import java.util.Optional;

public class Test {
    public static void main(String[] args){
    String name =   getCollegeName(DatabaseUtils.listStudents().get(0));
        System.out.println(name);
     System.out.println(DatabaseUtils.listStudents().get(0).getTeacher().getCollege().getName());
       System.out.println(isTeacher(DatabaseUtils.listStudents().get(1),"ll"));
      System.out.println(getCollegeName(DatabaseUtils.listStudents(),1));
        printCollegeName(DatabaseUtils.listStudents(), 2, 1);
    }
    /**
     * 基于给定学生，获取学生的导师的所在学院名称。
     * 任何一项不存在或失败，返回 未知学院
     */
    private static String getCollegeName(Student student){
//        return DatabaseUtils
//                .listStudents()
//                .stream()
//                .filter(student1 -> student.getTeacher().getCollege().getName().equals(student.getTeacher().getCollege().getName()))
//                .map(student2 -> student2.getTeacher().getCollege().getName())
//                .toString();
//        Optional<Student> optionalStudent = Optional.ofNullable(student);
//         optionalStudent.ifPresentOrElse(  student1 -> {
//             System.out.println(student1.getTeacher().getCollege().getName());
//
//         },()->{
//             System.out.println("未知学院");
//         });
//        return null;
      return   Optional.ofNullable(student).map(Student::getTeacher).map(Teacher::getCollege).map(College::getName).orElse("未知学院");
    }
    /**
     * 基于给定学生及教师姓名，判断是否为给定学生的指导教师。
     * 不匹配或不存在，均返回false

     */
    private static boolean isTeacher(Student student, String teacherName) {
      return  Optional.ofNullable(student)
              .filter(student1 -> student1.getTeacher().getName().equals(teacherName))
                .isPresent();
        //return false;
    }
    /**
     * 基于给定学生集合，学生编号，实现获取学生的导师的所在学院名称。
     * 任何一项不存在或失败，返回 未知学院
     * 结合collection stream findFirst()方法实现
     * 可直接通过一条方法链实现
     */
    private static String getCollegeName(List<Student> students, int sNumber) {
    return    students.stream()
              .filter(student -> student.getId() ==sNumber)
              .findFirst()
             // .ifPresentOrElse(student -> System.out.println(student.getTeacher().getCollege().getName()),()-> System.out.println("未知学院"));
              .map(student -> student.getTeacher().getCollege().getName())
              .orElse("未知学院");
             // return null;


    }
    /**
     * 实现在给定学生集合中查询指定编号学生，如果学生导师编号为指定编号，打印显式导师所在学院名称。
     * 任何一项不存在或失败，打印显式 未知学院
     * 结合collection stream findFirst()方法实现
     * 可直接通过一条方法链实现
     * @param sNumber，学生编号
     * @param tNumber，教师编号
     */
    private static void printCollegeName(List<Student> students, int sNumber, int tNumber) {
        students.stream()
                .filter(student -> student.getId()==sNumber)
                .filter(student -> student.getTeacher().getId()==tNumber)
                .findFirst()
                .ifPresentOrElse(student -> System.out.println(student.getTeacher().getCollege().getName()),()-> System.out.println("未知学院"));
    }
}
