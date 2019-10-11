package com.sc.web;

import com.sc.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by lijiaxing on 2019/9/30.
 */
@RestController
public class HelloController {

    @Autowired
    HelloService helloService;

    @RequestMapping("/hi")
    public String sayHello(@RequestParam(value = "name") String name){
        String str = helloService.hiService(name);
        return str;
    }
}
