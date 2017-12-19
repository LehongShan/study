package cn.shan.datastructure.tree;

import org.junit.Test;

import java.util.List;

/**
 * 树操作测试客户端
 * Created by shanlehong on 2017/12/19.
 */
public class TreeClient {


    @Test
    public void  testTreeParent(){
        TreeParent<String> treeParent = new TreeParent<>("root");
        TreeParent.Node root = treeParent.root();
        System.out.println(root);
        treeParent.addNode("a",root);
        treeParent.addNode("b",root);
        System.out.println("此树的深度为："+treeParent.deep());
        List<TreeParent.Node<String>> nodeList = treeParent.children(root);
        for (TreeParent.Node<String> node:nodeList){
            System.out.println(node);
        }
        System.out.println(treeParent.parent(root));
    }
}
