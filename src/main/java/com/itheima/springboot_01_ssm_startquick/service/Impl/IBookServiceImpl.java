package com.itheima.springboot_01_ssm_startquick.service.Impl;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.itheima.springboot_01_ssm_startquick.dao.BookMapper;
import com.itheima.springboot_01_ssm_startquick.domain.Book;
import com.itheima.springboot_01_ssm_startquick.service.IBookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class IBookServiceImpl extends ServiceImpl<BookMapper, Book> implements IBookService {

    @Autowired
    private  BookMapper bookMapper;

    @Override
    public IPage<Book> getPage(Integer pageCurrent,Integer pageSize) {
        IPage<Book> page = new Page<Book>(pageCurrent,pageSize);
        bookMapper.selectPage(page,null);
        return page;
    }
}
