package com.itheima.springboot_01_ssm_startquick.service.Impl;

import com.itheima.springboot_01_ssm_startquick.dao.BookMapper;
import com.itheima.springboot_01_ssm_startquick.domain.Book;
import com.itheima.springboot_01_ssm_startquick.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class BookServiceImpl implements BookService {

   @Autowired
   private BookMapper bookMapper;

    @Override
    public boolean sava(Book book) {

        return bookMapper.insert(book) > 0;
    }

    @Override
    public boolean update(Book book) {

        return bookMapper.updateById(book) > 0;
    }

    @Override
    public boolean delete(Integer id) {

        return bookMapper.deleteById(id) > 0;
    }

    @Override
    public Book getId(Integer id) {

        Book book = bookMapper.selectById(id);
        return book;
    }

    @Override
    public List<Book> getAll() {

        List<Book> books = bookMapper.selectList(null);

        return books;
    }
}
