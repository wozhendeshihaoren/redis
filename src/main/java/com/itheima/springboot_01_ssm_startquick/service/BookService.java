package com.itheima.springboot_01_ssm_startquick.service;

import com.itheima.springboot_01_ssm_startquick.domain.Book;

import java.util.List;

public interface BookService   {

    boolean sava(Book book);
    boolean update(Book book);
    boolean delete(Integer id);
    Book getId(Integer id);
    List<Book> getAll();
}
