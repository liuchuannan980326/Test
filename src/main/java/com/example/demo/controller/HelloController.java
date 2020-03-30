package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * Description:<br>
 * data:2020/2/2 13:54
 *
 * @author chuannan Liu
 */
/**@Controller
@ResponseBody  //这个类的所有方法返回给浏览器*/
@RestController

public class HelloController {

    @RequestMapping("/hello")

    public String hello(){
        return "Hello World!";
    }
}
