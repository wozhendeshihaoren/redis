package com.itheima.springboot_01_ssm_startquick.activeMQ;

import org.springframework.jms.annotation.JmsListener;
import org.springframework.jms.core.JmsMessagingTemplate;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

@Component
public class activeLister {

    @Resource
    private JmsMessagingTemplate jmsMessagingTemplate;

    @JmsListener(destination = "good")
    public  void recive(String id) {

        System.out.println("接收成功消息成功"+id);

    }
}
