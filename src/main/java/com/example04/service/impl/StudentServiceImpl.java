package com.example04.service.impl;
import com.example04.entity.Student;
import com.example04.resource.DatabaseUtils;
import com.example04.service.StudentService;

import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

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
       return DatabaseUtils.listStudents().stream().collect(Collectors.groupingBy(Student::getSex));
    }

    @Override
    public Map<Integer, Student> listStudentsByYearMapById(int year) {
        return DatabaseUtils.listStudents().stream().filter(student -> student.getYear() == year).collect(Collectors.toMap(Student::getId,student -> student));
    }

    @Override
    public boolean removeStudent(int id) {
        Iterator<Student> studentIterator = DatabaseUtils.listStudents().iterator();
        boolean b = false;
        while (studentIterator.hasNext()){
            Student student = studentIterator.next();
            if(id == student.getId()){
                studentIterator.remove();
                b = true;
            }
        }
       return b;
//        DatabaseUtils.listStudents().stream().filter(student -> student.getId()!=id).toList();
    }

}
