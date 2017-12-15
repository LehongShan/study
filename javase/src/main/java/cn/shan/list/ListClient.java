package cn.shan.list;

import org.junit.Test;

/**
 * Created by shanlehong on 2017/12/15.
 */
public class ListClient {


    @Test
    public void testLinkList(){
        LinkList<String> linkList = new LinkList<>();
        linkList.add("a");
        linkList.add("b");
        linkList.add("c");
        linkList.add("d");
        linkList.add("e");
        linkList.printLinkList();
    }

}
