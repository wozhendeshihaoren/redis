package com.itheima.springboot_01_ssm_startquick;

import com.itheima.springboot_01_ssm_startquick.domain.Book;
import com.itheima.springboot_01_ssm_startquick.service.IBookService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SSMApplicationTests {
    @Autowired
    private IBookService iBookService;
    @Test
    void contextLoads() {
        Book byId = iBookService.getById(1);
        System.out.println(byId);
    }

}
