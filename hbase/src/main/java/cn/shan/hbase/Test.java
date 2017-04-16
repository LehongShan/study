package cn.shan.hbase;
import cn.shan.hbase.HbaseUtil;

import java.util.HashMap;

/**
 * Created by Liao Qiulin 2017/4/1 17:57
 */
public class Test {
    public static void main(String[] args) {

        HashMap<String, String> values = new HashMap<String, String>();
        values.put("column1", "value1");
        values.put("column2", "value2");
        HbaseUtil.insert("", "", values);
    }
}
