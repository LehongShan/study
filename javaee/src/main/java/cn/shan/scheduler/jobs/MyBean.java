package cn.shan.scheduler.jobs;


import org.springframework.stereotype.Component;

/**
 * Created by shanlehong on 2017/4/28.
 */
@Component("myBean")
public class MyBean {

    public void printMessage() {

        System.out.println("I am MyBean. I am called by MethodInvokingJobDetailFactoryBean using SimpleTriggerFactoryBean");
    }
}
