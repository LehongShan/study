package com.shan.excel.client;

import com.shan.common.Common;
import com.shan.excel.ReadExcel;
import com.shan.excel.vo.Student;

import java.io.IOException;
import java.util.List;

/**
 * Created by shanlehong on 2017/5/8.
 */
public class Client {
    public static void main(String[] args) throws IOException {
        String excel2003_2007 = Common.STUDENT_INFO_XLS_PATH;
        String excel2010 = Common.STUDENT_INFO_XLSX_PATH;
        // read the 2003-2007 excel
        List<Student> list = new ReadExcel().readExcel(excel2003_2007);
        if (list != null) {
            for (Student student : list) {
                System.out.println("No. : " + student.getNo() + ", name : " + student.getName() + ", age : " + student.getAge() + ", score : " + student.getScore());
            }
        }
        System.out.println("======================================");
        // read the 2010 excel
        List<Student> list1 = new ReadExcel().readExcel(excel2010);
        if (list1 != null) {
            for (Student student : list1) {
                System.out.println("No. : " + student.getNo() + ", name : " + student.getName() + ", age : " + student.getAge() + ", score : " + student.getScore());
            }
        }
    }
}
