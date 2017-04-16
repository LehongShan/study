package cn.shan.comparable;

import lombok.Data;
import lombok.ToString;

import java.util.Comparator;

/**
 * Created by shanlehong on 2017/4/5.
 */
@Data
@ToString
public class Student implements Comparable<Student> {
    private String name;        // 姓名
    private int age;            // 年龄

    public Student(String name,int age){
        this.name = name;
        this.age = age;

    }




    @Override
    public int compareTo(Student o) {
        return this.age - o.age;
    }
}
