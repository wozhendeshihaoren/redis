package com.itheima.springboot_01_ssm_startquick.dao;


import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.itheima.springboot_01_ssm_startquick.domain.Book;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author woshihaoren
 */
@Mapper
public interface BookMapper extends BaseMapper<Book> {

}


