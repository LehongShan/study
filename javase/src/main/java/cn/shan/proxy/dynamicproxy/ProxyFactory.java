package cn.shan.proxy.dynamicproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @Description: jdk代理
 * 代理对象不需要实现接口,但是目标对象一定要实现接口,否则不能用动态代理
 * @Author: 单乐鸿
 * @CreateDate: 2019/3/17 20:56
 */
public class ProxyFactory<T> {


    private T t;

    public  ProxyFactory(T t) {
        this.t = t;
    }

    public T getInstance(){

       return (T) Proxy.newProxyInstance(t.getClass().getClassLoader(),
                t.getClass().getInterfaces(), new InvocationHandler() {
                    @Override
                    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

                        System.out.println("jdk proxy before");

                        Object returnValue = method.invoke(t,args);

                        System.out.println("jdk proxy after");

                        return returnValue;
                    }
                });
    }



}
