package com.example.demo.controller;

import com.example.demo.service.IStudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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
@RestController
@RequestMapping("/v1")
public class StudentController {
    @Autowired
    private IStudentService studentService;

    @GetMapping("/demo")
    public String getName() {
        return studentService.getById(1).getName();
    }
}
