package com.example04.resource;
import com.example04.entity.Student;
import java.util.List;
import java.util.ArrayList;
public class DatabaseUtils {
    private static final List<Student> STUDENTS = create();
    private static List<Student> create() {
        List<Student> students = new ArrayList<>();
        students.add(new Student(201007, Student.Sex.FEMALE, "赵阳阳", 2010));
        students.add(new Student(201015, Student.Sex.MALE, "邵鹏", 2010));
        students.add(new Student(201103, Student.Sex.MALE, "高学斌", 2011));
        students.add(new Student(201106, Student.Sex.MALE, "张扬", 2011));
        students.add(new Student(201212, Student.Sex.FEMALE, "吕惠玲", 2012));
        students.add(new Student(201207, Student.Sex.MALE, "曾志优", 2012));
        return students;
    }

    public static List<Student> listStudents() {
        return STUDENTS;
    }
}
