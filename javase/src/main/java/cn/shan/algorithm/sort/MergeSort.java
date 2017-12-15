package cn.shan.algorithm.sort;

/**
 * 归并算法
 * Created by shanlehong on 2017/12/14.
 */
public class MergeSort extends BaseSort {

    public static void sort(){
        mergeSort(scoreArr,0,scoreArr.length-1);
        System.out.println("\n归并排序开始");
        print();
        System.out.println("\n归并排序结束");

    }

    private static void mergeSort(int [] a,int left,int right){

        if (left<right){
            //找出中间索引
            int center = (left+right)/2;
            //对左边数组递归
            mergeSort(a,left,center);
            //对右边数组递归
            mergeSort(a,center+1,right);
            //合并
            merge(a,left,center,right);
        }

    }

    private static void merge(int [] a,int left,int center,int right){
        int [] temp = new int[a.length];
        int middle = center +1;
        int thirdIndex = left;
        int tempIndex = left;
        while (left<=center && middle<=right){
            if (a[left]<= a[middle]){
                temp[thirdIndex++] = a[left++];
            }else {
                temp[thirdIndex++] = a[middle++];
            }
        }
        while(middle<=right){
            temp[thirdIndex++] = a[middle++];
        }
        while (left<=center){
            temp[thirdIndex++] = a[left++];
        }
        while(tempIndex<=right){
            a[tempIndex] = temp[tempIndex++];
        }

    }

}
