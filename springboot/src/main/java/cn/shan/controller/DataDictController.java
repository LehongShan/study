package cn.shan.controller;

import cn.shan.service.DataDictService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by shanlehong on 2017/5/18.
 */
@Controller
@RequestMapping("boot")
public class DataDictController {
    @Resource
    private DataDictService dataDictService;

    @RequestMapping(value = "getDataDict")
    @ResponseBody
    public Map<String,Object> getDataDictList(){
        Map<String,Object> map = new HashMap<>();
        map.put("data",dataDictService.getDataDictList()) ;
        return map;
    }

}
