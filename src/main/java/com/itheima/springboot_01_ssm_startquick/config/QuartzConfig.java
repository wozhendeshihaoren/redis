//package com.itheima.springboot_01_ssm_startquick.config;
//
//import com.itheima.springboot_01_ssm_startquick.QuartzTest;
//import org.quartz.*;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.scheduling.annotation.Scheduled;
//import org.springframework.scheduling.quartz.QuartzJobBean;
//
//@Configuration
//public class QuartzConfig {
//
//
//    //工作明细
//    @Bean
//    public JobDetail printJobDetail() {
//
//        //工作明细中加入工作
//        return JobBuilder.newJob(QuartzTest.class).storeDurably().build();
//    }
//
//
//    //触发器
//    @Bean
//    public Trigger printTrigger() {
//        ScheduleBuilder scheduleBuilder = CronScheduleBuilder.cronSchedule("0/2 * * * * ?");
//        //触发器中加入工作明细和调度
//        return TriggerBuilder.newTrigger().forJob(printJobDetail()).withSchedule(scheduleBuilder).build();
//    }
//}
