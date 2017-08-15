package cn.shan.controller;

import cn.shan.mapper.ExcelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

/**
 *
 * Created by shanlehong on 2017/8/14.
 */
@RestController
@RequestMapping("excel")
public class ExcelController {
    @Autowired
    private ExcelMapper excelMapper;

    @GetMapping("export")
    public  void export(){
       List<Map> excelList =  excelMapper.findExcel();

    }
}
