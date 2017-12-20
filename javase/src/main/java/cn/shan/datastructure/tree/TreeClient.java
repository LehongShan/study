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

    @Test
    public void  testTreeChild(){
        TreeChild<String> treeChild = new TreeChild<>("root");
        TreeChild.Node root = treeChild.root();
        System.out.println(root);
        treeChild.addNode("a",root);
        List<TreeChild.Node<String>> nodeList = treeChild.children(root);
        treeChild.addNode("b",nodeList.get(0));
        List<TreeChild.Node<String>> nodeList1 = treeChild.children(root);
        System.out.println("此树的深度为："+treeChild.deep());
        for (TreeChild.Node<String> node:nodeList1){
            System.out.println(node);
        }
    }
}
