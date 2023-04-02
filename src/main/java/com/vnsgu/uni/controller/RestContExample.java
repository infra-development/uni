package com.vnsgu.uni.controller;

import com.vnsgu.uni.model.Student;
import com.vnsgu.uni.service.StudentService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

@RestController
public class RestContExample {
    private StudentService studentService;

    public RestContExample(StudentService studentService) {
        this.studentService = studentService;
    }

    @GetMapping(value = "/hello")
    public Map<String, String> helloWorld() {
        Map<String, String> message = new HashMap<>();
        message.put("message", "Hello World");
        return message;
    }

    @GetMapping(value = "/hello1")
    public void helloWorld1() {
        Set<Student> students = studentService.findAll();
        students.forEach(x -> {
            System.out.println(x.getStudentId() + " --> "+ x.getStudentName() + " --> " + x.getBirthDate());
        });
    }

}
