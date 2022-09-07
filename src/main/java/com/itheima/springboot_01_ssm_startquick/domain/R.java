package com.itheima.springboot_01_ssm_startquick.domain;

import java.io.Serializable;

/**
 * @author woshihaoren
 */
public class R implements Serializable {

    private Boolean flag;
    private Object Date;

    public R(Boolean flag, Object date) {
        this.flag = flag;
        Date = date;
    }

    public R(Boolean flag) {
        this.flag = flag;
    }

    public Boolean getFlag() {
        return flag;
    }

    public void setFlag(Boolean flag) {
        this.flag = flag;
    }

    public Object getDate() {
        return Date;
    }

    public void setDate(Object date) {
        Date = date;
    }

    @Override
    public String toString() {
        return "R{" +
                "flag=" + flag +
                ", Date=" + Date +
                '}';
    }
}
