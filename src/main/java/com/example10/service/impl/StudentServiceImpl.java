package com.example10.service.impl;
import com.example10.entity.Student;
import com.example10.resource.DatabaseUtils;
import com.example10.service.StudentService;

import java.util.Comparator;
import java.util.List;
import java.util.Map;

public class StudentServiceImpl implements StudentService {
   public List<Student> addStudent(Student student){
        DatabaseUtils.listStudents().add(student);
        return DatabaseUtils.listStudents();
    }

    @Override
    public List<Student> listStudentsByYear(int year) {
        return DatabaseUtils.listStudents().stream().filter(student -> student.getYear() == year).toList();
    }

    @Override
    public List<String> listStudentsNamesByYearBySex(int year, Student.Sex sex) {
        return DatabaseUtils.listStudents().stream().filter(student -> student.getYear() == year).filter(student -> student.getSex() == sex).map(Student::getName).toList();
   }

    @Override
    public List<Student> listStudentsByYearSortedById(int year) {
        return DatabaseUtils.listStudents().stream().filter(student -> student.getYear() == year).sorted(Comparator.comparing(Student::getId)).toList();
    }

    @Override
    public Map<Student.Sex, List<Student>> listStudentsMapBySex() {
        return null;
    }

    @Override
    public Map<Integer, Student> listStudentsByYearMapById(int year) {
        return null;
    }

    @Override
    public boolean removeStudent(int id) {
        return false;
    }

}
