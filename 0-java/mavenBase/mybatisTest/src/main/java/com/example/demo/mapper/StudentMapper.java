package com.example.demo.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.demo.domain.Student;
import org.apache.ibatis.annotations.Mapper;

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
@Mapper
public interface StudentMapper extends BaseMapper<Student> {
}
