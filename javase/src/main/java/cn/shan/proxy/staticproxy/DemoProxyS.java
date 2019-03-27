package cn.shan.proxy.staticproxy;

import cn.shan.proxy.base.Demo;
import cn.shan.proxy.base.IDemo;

/**
 * @Description: 静态代理模式
 * 可以做到在不修改目标对象的功能前提下,对目标功能扩展
 * @Author: 单乐鸿
 * @CreateDate: 2019/3/17 20:41
 */
public class DemoProxyS implements IDemo {


    private IDemo demo;
    public DemoProxyS(IDemo demo){
        this.demo = demo;
    }
    @Override
    public void say(String s) {
        System.out.println("DemoProxyS before");
        demo.say(s);
        System.out.println("DemoProxyS after");
    }
}
