package cn.shan.datastructure.queue;

/**
 * 顺序队列
 * Created by shanlehong on 2017/12/18.
 */
public class SequenceQueue<T> {
    private int DEFAULT_SIZE = 10;
    //保存数组的长度
    private int capacity;
    //定义个数组用于保存顺序栈的元素
    private Object[] elementsData;

    private int front;
    private int rear;

    public SequenceQueue(){
        capacity = DEFAULT_SIZE;
        elementsData = new Object[capacity];
    }

}
