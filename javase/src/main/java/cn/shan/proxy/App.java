package cn.shan.proxy;

import cn.shan.proxy.base.Demo;
import cn.shan.proxy.base.IDemo;
import cn.shan.proxy.staticproxy.DemoProxyS;


/**
 * @Description: 代理
 * @Author: 单乐鸿
 * @CreateDate: 2019/3/17 21:03
 */
public class App {


    public static void main(String[] args) {
        IDemo demo = new Demo();
        demo.say("demo");

        //static proxy
        new DemoProxyS(new Demo()).say("demo");
        //jdk proxy
        IDemo demo1 = new cn.shan.proxy.dynamicproxy.ProxyFactory<>(demo).getInstance();
        demo1.say("demo");
        //cglib proxy
        IDemo demo2 = new cn.shan.proxy.cglibproxy.ProxyFactory<>(demo).getInstance();
        demo2.say("demo");

    }
}
