package com.example05.resource;

import com.example05.entity.College;
import com.example05.entity.Student;
import com.example05.entity.Teacher;

import java.util.ArrayList;
import java.util.List;

public class DatabaseUtils {
    private static final List<Student> STUDENTS = create();
    private static List<Student> create() {

        College college1 = new College("信息");
        College college2 = new College("设计");
        Teacher teacher1 = new Teacher(1, "wb", college1);
        Teacher teacher2 = new Teacher(2, "ll", college2);
        Student student1 = new Student(1, "syl", "2022", teacher1);
        Student student2 = new Student(2, "mike", "2022", teacher2);
        Student student3 = new Student(3, "bob", "2023", teacher2);
        Student student4 = new Student(4, "qq", "2021", teacher1);
        List<Student> students = new ArrayList<>();
        students.add(student1);
        students.add(student2);
        students.add(student3);
        students.add(student4);
        return students;
    }
    public static List<Student> listStudents() {
        return STUDENTS;
    }
}
