package com.itheima.springboot_01_ssm_startquick;

import com.itheima.springboot_01_ssm_startquick.activeMQ.Test1;
import com.itheima.springboot_01_ssm_startquick.service.Impl.SendMailImpl;
import com.itheima.springboot_01_ssm_startquick.service.SendMail;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.scheduling.annotation.Async;

import javax.mail.MessagingException;
import javax.mail.internet.MimeMessage;

@SpringBootTest
public class MailTest {

    @Autowired
    private JavaMailSender javaMailSender;

    private String from = "17876596208@163.com";
    private String to = "yanghuahui1999@gmail.com";
    private String subject = "好看的图片";
    private String text = "<a href = 'https://scpic.chinaz.net/files/pic/pic9/202009/apic27858.jpg'>点开有惊喜</a>";

    @Test
    public void mailTest() {
        SimpleMailMessage meassage = new SimpleMailMessage();
        meassage.setFrom(from);
        meassage.setTo(to);
        meassage.setSubject(subject);
        meassage.setText(text);
        javaMailSender.send(meassage);
    }
    @Autowired
    private Test1 test1;
    @Test
    public void test() {
        test1.test1();
        test1.test2();
        test1.test3();
    }
}


