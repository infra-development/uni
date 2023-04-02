package com.vnsgu.uni.controller;

import com.vnsgu.uni.model.Student;
import com.vnsgu.uni.service.StudentService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class StudentController {

    private final StudentService studentService;

    private static final String STUDENT_CREATE_FORM = "students/new-student";
    private static final String STUDENT_UPDATE_FORM = "students/update-student";
    private static final String STUDENT_INDEX = "students/index";
    private static final String REDIRECT_TO_ROOT = "redirect:/";

    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    @GetMapping("/")
    public String viewHomePage(Model model) {
        model.addAttribute("all_students_list", studentService.findAll());
        return STUDENT_INDEX;
    }

    @GetMapping("/add")
    public String addNewUser(Model model) {
        Student student = new Student();
        model.addAttribute("student", student);
        return STUDENT_CREATE_FORM;
    }

    @PostMapping("/save")
    public String saveStudent(Student student) {
        studentService.save(student);
        return REDIRECT_TO_ROOT;
    }

    @GetMapping("/showFormForUpdate/{id}")
    public String updateForm(@PathVariable(value = "id") Long id, Model model) {
        Student student = studentService.findById(id);
        model.addAttribute("student", student);
        return STUDENT_UPDATE_FORM;
    }

    @GetMapping("/deleteStudent/{id}")
    public String deleteStudent(@PathVariable(value = "id") Long id) {
        studentService.deleteById(id);
        return REDIRECT_TO_ROOT;
    }

}
