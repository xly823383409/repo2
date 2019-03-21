package com.xly.test;


import com.xly.dao.StudentDao;
import com.xly.domain.Student;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

public class XlyTEst {

    public static void main(String[] args) throws IOException {
//        ApplicationContext cs =
//                new ClassPathXmlApplicationContext("spring.xml");
//
//        StudentService studentService = (StudentService) cs.getBean("studentService");
//
//        studentService.c();
        InputStream in = Resources.getResourceAsStream("mybatis");
        SqlSessionFactoryBuilder builder = new SqlSessionFactoryBuilder();
        SqlSessionFactory factory = builder.build(in);
        //3.使用工厂生产SqlSession对象
        SqlSession session = factory.openSession();
        //4.使用SqlSession创建Dao接口的代理对象
        StudentDao studentDao= session.getMapper(StudentDao.class);
        List<Student> all = studentDao.findAll();
        for (Student student : all) {

            System.out.println(student);
        }

        in.close();

    }
}
