package com.itheima.springboot_01_ssm_startquick.activeMQ;

import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;

@Component
public class Test1 {

    @Async
    public  void test1() {
        System.out.println("yang");
    }
     @Async
    public  void test2() {
        for(int i = 1; i < 10000001;i++) {
            if( i == 10000000) {
                System.out.println("yang");

            }
        }
    }
    @Async
    public  void test3() {
        System.out.println("yang3");
    }
}
