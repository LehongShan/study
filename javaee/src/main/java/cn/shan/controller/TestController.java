package cn.shan.controller;

import cn.shan.util.BigdataHttpClientUtils;
import org.apache.commons.io.IOUtils;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.io.IOException;

/**
 * Created by shanlehong on 2017/3/28.
 */
@Controller
@RequestMapping("test")
public class TestController {
    @RequestMapping(value = "http/post",method = RequestMethod.POST)
    @ResponseBody
    public String testHttpPost( HttpServletRequest request) throws IOException {
        request.setCharacterEncoding("UTF-8");
        String str = IOUtils.toString(request.getInputStream(),"UTF-8");
        System.out.println(str);

        return str;
    }


    @RequestMapping(value = "send/post",method = RequestMethod.POST)
    @ResponseBody
    public String testSendPost(@RequestBody  String jsonStr) throws IOException {
        System.out.println(jsonStr);
        BigdataHttpClientUtils.httpPost("http://117.78.49.155:8280/test-http/test/http/post",jsonStr);
        return jsonStr;

    }
}
