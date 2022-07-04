package com.example.h2test;

import com.example.h2test.dao.UserRepository;
import com.example.h2test.domain.User;
import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.transaction.Transactional;

@SpringBootTest
@RunWith(SpringRunner.class)
class H2TestApplicationTests {

    @Autowired
    private UserRepository repository;

    @Test
    @Transactional
    void contextLoads() {
        User u = repository.getOne(1L);
        Assert.assertEquals("成功的测试用例", "Jone", u.getName());
    }

}

