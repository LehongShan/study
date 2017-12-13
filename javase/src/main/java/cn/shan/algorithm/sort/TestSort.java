package cn.shan.algorithm.sort;

import org.junit.Test;

/**
 * Created by shanlehong on 2017/12/12.
 */
public class TestSort {

    @Test
    public void testBubbleSort() {
        BaseSort.print();
        BubbleSort.sort();
        QuickSort.sort();
    }
}
