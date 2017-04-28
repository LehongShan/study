package cn.shan.scheduler.util;

import org.springframework.stereotype.Component;

/**
 * Created by shanlehong on 2017/4/28.
 */
@Component("anotherBean")
public class AnotherBean {
    public void printAnotherMessage(){
        System.out.println("I am AnotherBean. I am called by Quartz jobBean using CronTriggerFactoryBean");
    }
}
