package com.example10;
import com.example10.entity.Student;
//import com.example10.resource.DatabaseUtils;
import com.example10.resource.DatabaseUtils;
import com.example10.service.StudentService;
import com.example10.service.impl.StudentServiceImpl;

import java.util.Iterator;
import java.util.List;
import java.util.Map;

import static com.example10.entity.Student.Sex.FEMALE;

public class Test {
   public static final StudentService studentService = new StudentServiceImpl();
    public static void main(String[] args){
    //addStudentTest();
   //listStudentsByYearTest();
    //listStudentsNamesByYearBySexTest();
     // listStudentsByYearSortedByIdTest();
      //  listStudentsMapBySexTest();
      //  listStudentsByYearMapByIdTest();
        removeStudentTest();
      //  listStudentsByYearMapByIdTest();
    }
    private static void addStudentTest(){
        Student student1 = new Student(202222,FEMALE,"syl",2022);
        List<Student> students = studentService.addStudent(student1);
        students.forEach(student -> System.out.println(student.getName()));
    }
    private static void listStudentsByYearTest(){
        //int year = 2010;
       List<Student> students =  studentService.listStudentsByYear(2010);
       students.forEach(student -> System.out.println(student.getName()));
    }
    private static void listStudentsNamesByYearBySexTest(){
        int year = 2012;
        Student.Sex sex = FEMALE;
        List<String> students =  studentService.listStudentsNamesByYearBySex(year,sex);
       for(String i :students){
           System.out.println(i);
       }
    }
    private static void listStudentsByYearSortedByIdTest(){
        //int year = 2011;
        List<Student> students = studentService.listStudentsByYearSortedById(2012);
        students.forEach(student -> System.out.println(student.getName()));
     }
    private static void listStudentsMapBySexTest(){
        Map<Student.Sex,List<Student>> sexListMap =  studentService.listStudentsMapBySex();
       // sexListMap.forEach((sex, students) -> System.out.println(sex + "/" + students.getName));
        for(Map.Entry<Student.Sex,List<Student>> all: sexListMap.entrySet()){
            System.out.println(all.getKey());
            for(Student values:all.getValue()){
                System.out.println(values.getName());
            }
        }
//        sexListMap.forEach((sex, students) -> {
//            System.out.println(sex);
//            for(Student i:students){
//                System.out.println(i.getName());
//            }
//        });
    }
    private static void listStudentsByYearMapByIdTest(){
        Map<Integer, Student> map =  studentService.listStudentsByYearMapById(2022);
        //map.forEach((integer, student) -> System.out.println(student.getId(),student.getName()));
        for(Map.Entry<Integer,Student> all:map.entrySet()){
            System.out.println(all.getKey() + " " + all.getValue().getName());
        }
    }
    private static void removeStudentTest(){
        System.out.println(studentService.removeStudent(201007));
//        DatabaseUtils.listStudents().removeIf(student -> 201007==student.getId());
   List<Student> students = DatabaseUtils.listStudents();
        students.forEach(student -> System.out.println(student.getId()));
    }
}
