package cn.shan.algorithm.sort;

import org.junit.Test;

/**
 * 排序触发客户端
 * Created by shanlehong on 2017/12/12.
 */
public class SortClient {

    @Test
    public void testSort() {
        BaseSort.print();
        BubbleSort.sort();
        QuickSort.sort();
        SearchSort.sort();
        SearchSort.sort2();
    }
}
