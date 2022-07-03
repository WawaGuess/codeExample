package com.example.demo.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.demo.domain.Student;
import com.example.demo.mapper.StudentMapper;
import com.example.demo.service.IStudentService;
import org.springframework.stereotype.Service;

/**
 * @author WawaGuess
 * @project mybatisTest
 * @Date 2022/7/2
 * 【到下一行】shift + enter
 * 【定位到某一行】command + L
 * 【定位到行首/行尾】command + 方向键
 * 【在下一行插入一个空行】command + enter
 * 【构造方法/toString/override提示】control + enter
 */
@Service
public class StudentService extends ServiceImpl<StudentMapper, Student> implements IStudentService {


    @Override
    public String getName() {

        return "test";
    }
}
