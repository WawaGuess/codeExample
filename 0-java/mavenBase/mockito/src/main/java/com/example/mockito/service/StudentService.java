package com.example.mockito.service;

import com.example.mockito.dao.StudentDao;
import com.example.mockito.domain.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentService {
    @Autowired
    StudentDao studentDao;

    public Student getStudentById() {
        return studentDao.getById();
    }
}
