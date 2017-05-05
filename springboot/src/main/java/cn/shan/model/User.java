package cn.shan.model;

import lombok.Data;
import lombok.ToString;

/**
 * Created by shanlehong on 2017/5/5.
 */
@Data
@ToString
public class User {
    private int id;
    private String name;
    private int age;
    private String password;
}
