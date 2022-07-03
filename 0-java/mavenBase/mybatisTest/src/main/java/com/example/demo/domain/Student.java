package com.example.demo.domain;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

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
@Data
@TableName("student")
public class Student {


    @TableId("id")
    private Integer id;

    private String name;

    @TableField("s_sex")
    private String sSex;
}
