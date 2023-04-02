package com.vnsgu.uni.repository;

import com.vnsgu.uni.model.Student;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface StudentRepository extends CrudRepository<Student, Long> {

    Student findByStudentName(String studentName);

    List<Student> findAllByStudentNameLike(String studentName);
}
