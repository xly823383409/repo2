package com.xly.dao;


import com.xly.domain.Student;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface StudentDao {

    @Select("select * from student")
    List<Student> findAll();

    @Insert("insert into student (sname,sage,ssex,price) values (#{sname},#{sage},#{ssex},#{price})")
    void addStudent(Student student);
}
