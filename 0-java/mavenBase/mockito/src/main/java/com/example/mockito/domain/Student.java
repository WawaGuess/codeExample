package com.example.mockito.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

// 设置get/set方法
@Data
// 设置全参构造方法
@AllArgsConstructor
// 设置无参构造方法
@NoArgsConstructor
public class Student {
    private String name;
    private int age;
    private Integer id;
}
