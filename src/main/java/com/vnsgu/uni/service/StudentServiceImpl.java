package com.vnsgu.uni.service;

import com.vnsgu.uni.model.Student;
import com.vnsgu.uni.repository.StudentRepository;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Service
public class StudentServiceImpl implements StudentService {

    private StudentRepository studentRepository;

    public StudentServiceImpl(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    @Override
    public Set<Student> findAll() {
        Set<Student> students = new HashSet<>();
        this.studentRepository.findAll().forEach(students :: add);
        return students;
    }

    @Override
    public Student findById(Long id) {
        return this.studentRepository.findById(id).orElse(null);
    }

    @Override
    public Student save(Student student) {
        return this.studentRepository.save(student);
    }

    @Override
    public void delete(Student student) {
        this.studentRepository.delete(student);
    }

    @Override
    public void deleteById(Long id) {
        this.studentRepository.deleteById(id);
    }

    @Override
    public Student findByStudentName(String studentName) {
        return this.studentRepository.findByStudentName(studentName);
    }

    @Override
    public List<Student> findAllByStudentNameLike(String studentName) {
        return this.studentRepository.findAllByStudentNameLike(studentName);
    }
}
