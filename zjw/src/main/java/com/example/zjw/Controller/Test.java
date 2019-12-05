package com.example.zjw.Controller;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: Zjw
 * @Date: 2019/12/5 15:08
 * msg:
 */
@RestController
public class Test {

    
    @RequestMapping("/hello")
    public String test(){
        return "hello";
    }
}
