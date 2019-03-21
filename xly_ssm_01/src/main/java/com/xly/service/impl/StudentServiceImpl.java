package com.xly.service.impl;



import com.xly.dao.StudentDao;
import com.xly.domain.Student;
import com.xly.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service("studentService")
public class StudentServiceImpl implements StudentService {
    @Autowired
    private StudentDao dao;


    public void findAll (){
        System.out.println("来了老弟");
        List<Student> students = dao.findAll();
        for (Student student : students) {
            System.out.println(student);
        }

    }

    public void  add(Student student){
        dao.addStudent(student);
        int i = 1/0;
    }

}
