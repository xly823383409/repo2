package com.xly.controller;



import com.xly.domain.Student;
import com.xly.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Date;

@Controller
@RequestMapping("/student")
public class StudentController {
    @Autowired
    private StudentService studentService;

    @RequestMapping("/hello")
    public String hello (){
        System.out.println("来了老弟1");
        studentService.findAll();
        return "success";
    }
    @RequestMapping("/add")
    public String add (Student student){
        student.setSname("钱小彬");
        student.setSsex("男");
        student.setSage(new Date());
        student.setPrice(100);
        studentService.add(student);
        studentService.findAll();
        return "success";
    }
}
