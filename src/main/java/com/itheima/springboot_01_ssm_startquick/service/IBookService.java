package com.itheima.springboot_01_ssm_startquick.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.IService;
import com.itheima.springboot_01_ssm_startquick.domain.Book;
import com.sun.org.apache.xpath.internal.operations.Bool;

public interface IBookService extends IService<Book> {

    public IPage<Book> getPage(Integer pageCurrent,Integer pageSize);
}
