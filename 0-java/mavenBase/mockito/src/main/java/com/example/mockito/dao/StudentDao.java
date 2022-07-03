package com.example.mockito.dao;

import com.example.mockito.domain.Student;
import org.springframework.stereotype.Component;

@Component
public class StudentDao {

    public Student getById() {
        return new Student("张三", 20, 5);
    }
}
