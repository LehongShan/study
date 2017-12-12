package cn.shan.algorithm.sort;

import org.junit.Test;

/**
 * Created by shanlehong on 2017/12/12.
 */
public abstract class BaseSort {

    public  int[] scoreArr = {20,2,10,8,12,17,4,25,11,6,33,13,24};

    public void print(){
        for (int score:scoreArr){
            System.out.print(score+"\t");
        }

    }


}
