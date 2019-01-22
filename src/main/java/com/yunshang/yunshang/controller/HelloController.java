package com.yunshang.yunshang.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author qianzc
 * @description
 * @email qianzc@oceansoft.com.cn
 * @createDate 2019/1/22 16:31
 */
@Controller
public class HelloController {

    @RequestMapping(value="hello",method = RequestMethod.GET)
    @ResponseBody
    public String hello(){
        return "Hello World!";
    }
}
