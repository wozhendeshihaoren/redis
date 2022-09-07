package com.itheima.springboot_01_ssm_startquick.domain;


import lombok.Data;

import java.io.Serializable;

/**
 * @author woshihaoren
 */
@Data
public class Book implements Serializable {

    private Integer id;
    private String type;
    private String name;
    private String description;

}
