package com.example.demo.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.example.demo.domain.Student;

/**
 * @author WawaGuess
 * @project codeExample
 * @Date 2022/7/3
 * 【到下一行】shift + enter
 * 【定位到某一行】command + L
 * 【定位到行首/行尾】command + 方向键
 * 【在下一行插入一个空行】command + enter
 * 【构造方法/toString/override提示】control + enter
 */
public interface IStudentService extends IService<Student> {
    // 测试方法
    String getName();
}
