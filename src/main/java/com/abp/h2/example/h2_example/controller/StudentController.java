package com.abp.h2.example.h2_example.controller;

import com.abp.h2.example.h2_example.model.Student;
import com.abp.h2.example.h2_example.service.StudentServiceImpl;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

@RestController
public class StudentController {

    StudentServiceImpl studentService;

    public StudentController(StudentServiceImpl studentService) {
        this.studentService = studentService;
    }

    @GetMapping("/student")
    public List<Student> getStudent(){
        try {
            return studentService.getStudent();
        } catch (Exception exception){
            return Arrays.asList(new Student(1, "Test_User", 100));
        }
    }

    @PostMapping("/addStudent")
    public boolean addStudent(@RequestBody Student student){
        if(studentService.addStudent(student)!=null){
            return true;}
        return false;
    }

    @PostMapping("/addDummyStudent")
    public List<Student> addDummyStudent(@RequestBody Student student){
        if(Objects.nonNull(student)){
            return Arrays.asList(new Student(student.getStdId(), student.getStdName(), student.getStdAge()));
        }
        return Collections.emptyList();
    }
}
