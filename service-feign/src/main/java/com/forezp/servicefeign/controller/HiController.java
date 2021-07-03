package com.forezp.servicefeign.controller;

import com.forezp.servicefeign.feign.SchedualServiceHi;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author chenxingguang
 * @date 2021/06/02  14:33
 **/
@RestController
public class HiController {
    @Autowired
    SchedualServiceHi schedualServiceHi;


    @GetMapping(value = "/hi")
    public String sayHi(@RequestParam String name) {
        return schedualServiceHi.sayHiFromClientOne( name );
    }

}
