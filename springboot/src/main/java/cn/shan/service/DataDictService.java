package cn.shan.service;

import cn.shan.mapper.DataDictMapper;
import cn.shan.model.DataDict;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by shanlehong on 2017/5/18.
 */
@Service
public class DataDictService {
    @Resource
    private DataDictMapper dataDictMapper;

    public List<DataDict> getDataDictList(){
        return dataDictMapper.getDataDict();
    }
}
