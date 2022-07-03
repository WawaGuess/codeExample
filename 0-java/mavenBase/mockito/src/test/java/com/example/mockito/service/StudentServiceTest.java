package com.example.mockito.service;

import com.example.mockito.dao.StudentDao;
import com.example.mockito.domain.Student;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;


@SpringBootTest
class StudentServiceTest {

    @Autowired
    StudentService studentService;

    @MockBean
    StudentDao studentDao;


    @BeforeEach
    void setUp() {
        Mockito.when(studentDao.getById()).thenReturn(new Student("李四", 30, 5));
    }

    @Test
    void getStudentById() {
        Student student = studentService.getStudentById();
        Assertions.assertNotNull(student);
        Assertions.assertEquals(30, student.getAge());
        Assertions.assertEquals("李四", student.getName());
    }
}