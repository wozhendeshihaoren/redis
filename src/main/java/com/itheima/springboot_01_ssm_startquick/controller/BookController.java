package com.itheima.springboot_01_ssm_startquick.controller;

import com.alicp.jetcache.anno.Cached;
import com.itheima.springboot_01_ssm_startquick.domain.Book;
import com.itheima.springboot_01_ssm_startquick.domain.R;
import com.itheima.springboot_01_ssm_startquick.service.IBookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

@RestController
@RequestMapping("/books")
public class BookController {

    @Autowired
    private IBookService iBookService;

    @GetMapping
    public R getAll() {

        return new R(true,iBookService.list());
    }
    @PostMapping
    public R save(@RequestBody Book book) {

        return new R(iBookService.save(book));
    }

    @DeleteMapping("{id}")
    public R delete(Integer id) {

        return new R(iBookService.removeById(id));

    }

    @PutMapping
    public R put(@RequestBody Book book){

        return new R(iBookService.update(book,null));
    }

    @GetMapping("{id}")
    @Cached( name = "book_"  ,key = "#id",expire = 50 )
    public  R getById(@PathVariable Integer id) {

        return new R(true,iBookService.getById(id));
    }

    @GetMapping("{pageCurrent}/{pageSize}")
    public  R getPage(@PathVariable Integer pageCurrent, @PathVariable Integer pageSize) {

        return new R(true,iBookService.getPage(pageCurrent,pageSize));
    }

}
