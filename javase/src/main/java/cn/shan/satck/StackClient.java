package cn.shan.satck;

import org.junit.Test;

/**
 * 栈测试客户端
 * Created by shanlehong on 2017/12/15.
 */
public class StackClient {

    @Test
    public void testSequenceStack(){
        SequenceStack<String> sequenceStack = new SequenceStack<>();
        sequenceStack.push("aaaaa");
        sequenceStack.push("bbbbb");
        sequenceStack.push("ccccc");
        sequenceStack.push("ddddd");
        sequenceStack.printStack();
        System.out.println("栈顶元素："+sequenceStack.peek());
        System.out.println("出栈元素："+sequenceStack.pop());
        sequenceStack.push("eeeee");
        sequenceStack.printStack();
    }

}
