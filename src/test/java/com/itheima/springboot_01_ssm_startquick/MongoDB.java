package com.itheima.springboot_01_ssm_startquick;

import com.itheima.springboot_01_ssm_startquick.domain.Book;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.mongodb.core.MongoTemplate;

@SpringBootTest
public class MongoDB {

    @Autowired
    private MongoTemplate mongoTemplate;

    @Test
    public  void mongoTest() {
        Book book = new Book();
        book.setId(1);
        book.setType("java");
        book.setName("mongodb学习");
        book.setDescription("好书");
        mongoTemplate.save(book);
    }
}
