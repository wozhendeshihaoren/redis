package com.itheima.springboot_01_ssm_startquick;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.itheima.springboot_01_ssm_startquick.activeMQ.ActiveMQTest;

import com.itheima.springboot_01_ssm_startquick.dao.BookMapper;
import com.itheima.springboot_01_ssm_startquick.domain.Book;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.logging.LogManager;

@SpringBootTest
public class DaoTest {
    @Autowired
    private BookMapper bookMapper;

    @Test
    void getBook(){

        bookMapper.selectById(1);

    }

    @Test
    void save() {

        Book book = new Book();
        book.setName("javaWeb");
        book.setType("计算机理论");
        book.setDescription("java的相关技术");
        bookMapper.insert(book);

    }
    @Test
    void  selectPage() {
        Page page = new Page(1,1);
        bookMapper.selectPage(page,null);

    }

    @Autowired
    private ActiveMQTest activeMQTest;

    @Test
    void active() {
        activeMQTest.send("我是帅哥");
    }

}
