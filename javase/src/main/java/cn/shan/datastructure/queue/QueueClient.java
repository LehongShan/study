package cn.shan.datastructure.queue;

import org.junit.Test;

/**
 * 队列客户端
 * Created by shanlehong on 2017/12/18.
 */
public class QueueClient {

    @Test
    public void testSequenceQueue(){
        SequenceQueue<String> sequenceQueue = new SequenceQueue<>();
        sequenceQueue.add("aaaa");
        sequenceQueue.add("bbbb");
        sequenceQueue.printQueue();
        sequenceQueue.remove();
        System.out.println("\n以下出现顺序队列假满情况");
        sequenceQueue.add("cccc");
        sequenceQueue.printQueue();

    }


}
