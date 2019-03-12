package com.sky.springboot.controller;


import com.adachina.cfgcenter.config.BaseGenericConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

//这个类的所有方法返回的数据直接写给浏览器，（如果是对象转为json数据）
/*@ResponseBody
@Controller*/
@RestController
public class HelloController {

    @Autowired
    private BaseGenericConfig baseGenericConfig;

    @RequestMapping("/hello/{key}")
    public String hello(@PathVariable("key") String key){

        String value = baseGenericConfig.getPropertyWithDft(key,"nullVlave");

        return "hello world quick!"+value;
    }

    // RESTAPI的方式
}
