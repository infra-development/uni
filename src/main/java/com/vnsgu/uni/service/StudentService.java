package com.vnsgu.uni.service;

import com.vnsgu.uni.model.Student;

import java.util.List;

public interface StudentService extends CrudService<Student, Long> {
    Student findByStudentName(String studentName);

    List<Student> findAllByStudentNameLike(String studentName);

}
