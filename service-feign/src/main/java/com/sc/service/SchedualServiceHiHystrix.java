package com.sc.service;

import org.springframework.stereotype.Component;

/**
 * Created by lijiaxing on 2019/9/30.
 */
@Component
public class SchedualServiceHiHystrix implements SchedualServiceHi {
    @Override
    public String sayHiFromClientOne(String name){
        return "sorry "+name;
    }


}
