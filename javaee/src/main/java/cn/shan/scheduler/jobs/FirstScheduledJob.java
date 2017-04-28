package cn.shan.scheduler.jobs;

import cn.shan.scheduler.util.AnotherBean;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.springframework.scheduling.quartz.QuartzJobBean;

/**
 * Created by shanlehong on 2017/4/28.
 */
public class FirstScheduledJob extends QuartzJobBean {

    private AnotherBean anotherBean;
    public void setAnotherBean(AnotherBean anotherBean) {
        this.anotherBean = anotherBean;
    }

    @Override
    protected void executeInternal(JobExecutionContext jobExecutionContext) throws JobExecutionException {
        System.out.println("I am FirstScheduledJob");
        this.anotherBean.printAnotherMessage();
    }
}
