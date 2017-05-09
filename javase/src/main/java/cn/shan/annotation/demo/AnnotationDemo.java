package cn.shan.annotation.demo;

import cn.shan.annotation.MyTag;
import cn.shan.annotation.vo.Car;
import lombok.Data;
import lombok.ToString;

/**
 * Created by shanlehong on 2017/5/8.
 */
@Data
@ToString
public class AnnotationDemo {
    @MyTag(name = "audi",size =10)
    private Car car;
}
