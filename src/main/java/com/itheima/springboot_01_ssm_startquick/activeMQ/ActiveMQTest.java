package com.itheima.springboot_01_ssm_startquick.activeMQ;

import org.springframework.jms.core.JmsMessagingTemplate;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class ActiveMQTest   {
     @Resource
     private JmsMessagingTemplate jmsMessagingTemplate;

     public  void send(String id) {
          System.out.println(id);
          jmsMessagingTemplate.convertAndSend(id);
     }
}
