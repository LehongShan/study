package cn.shan.proxy.cglibproxy;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * @Description: cglib proxy
 * @Author: 单乐鸿
 * @CreateDate: 2019/3/17 22:23
 */
public class ProxyFactory<T> implements MethodInterceptor {


    private T t;

    public ProxyFactory(T t){

        this.t = t;
    }

    public T getInstance(){
        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(t.getClass());
        enhancer.setCallback(this);
        return (T) enhancer.create();
    }


    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {

        System.out.println("cglib proxy before");
        Object data = method.invoke(t,objects);
        System.out.println("cglib proxy after");
        return data;
    }
}
