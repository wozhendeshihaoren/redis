package com.itheima.springboot_01_ssm_startquick.service.Impl;

import com.itheima.springboot_01_ssm_startquick.service.SendMail;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Service;

import javax.mail.MessagingException;
import javax.mail.internet.MimeMessage;

@Service
public class SendMailImpl implements SendMail {
    @Autowired
    private JavaMailSender javaMailSender;

    private String from =  "17876596208@163.com";
    private String to = "yanghuahui1999@gmail.com";
    private String subject = "好看的图片";
    private String text = "<a href = 'bilibili.com'>点开有惊喜</a>";
    @Override
    public void sendMail() {
        MimeMessage message =  javaMailSender.createMimeMessage();
        MimeMessageHelper helper = new MimeMessageHelper(message);
        try {
            helper.setFrom(from);
            helper.setTo(to);
            helper.setSubject(subject);
            helper.setText(text,true);
            javaMailSender.send(message);
        } catch (MessagingException e) {
            e.printStackTrace();
        }

    }
    }

