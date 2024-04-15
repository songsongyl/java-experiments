package com.example10;

import com.example10.entity.Student;
//import com.example10.resource.DatabaseUtils;
import com.example10.service.StudentService;
import com.example10.service.impl.StudentServiceImpl;

import java.util.List;

import static com.example10.entity.Student.Sex.FEMALE;

public class Test {
   public static final StudentService studentService = new StudentServiceImpl();
    public static void main(String[] args){
    //addStudentTest();
   //listStudentsByYearTest();
    //listStudentsNamesByYearBySexTest();
     // listStudentsByYearSortedByIdTest();
        listStudentsMapBySexTest();
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

    }
}
