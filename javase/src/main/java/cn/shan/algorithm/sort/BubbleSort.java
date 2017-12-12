package cn.shan.algorithm.sort;

import org.junit.Test;

/**
 * Created by shanlehong on 2017/12/12.
 */
public class BubbleSort extends BaseSort {


   public void sort(){
       print();
       for (int i = 0; i<scoreArr.length-1;i++){
           for (int j =0;j<scoreArr.length-i-1;j++){
               if (scoreArr[j]>scoreArr[j+1]){
                   int temp = scoreArr[j];
                   scoreArr[j] = scoreArr[j+1];
                   scoreArr[j+1] = temp;
               }
           }
       }
       System.out.println("\n冒泡排序开始");
       print();
       System.out.println("\n冒泡排序结束");

   }


}
