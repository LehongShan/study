package cn.shan.model;

import lombok.Data;
import lombok.ToString;

/**
 * Created by shanlehong on 2017/5/18.
 */
@Data
@ToString
public class DataDict {
    private int  id; // 自增长主键
    private String dataType; //数据字典类型
    private String dataTypeName; //数据字典类型名称
    private String dataTypeEnum;//数据字典枚举
    private String dataTypeEnumName; //数据字典枚举名称
    private int deleteFlg; //删除标识
}
