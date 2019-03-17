package cn.shan.proxy.base;

/**
 * @Description:
 * @Author: 单乐鸿
 * @CreateDate: 2019/3/17 20:42
 */
public class Demo implements IDemo {
    @Override
    public void say(String s) {
        System.out.println("demo say: "+ s);
    }
}
