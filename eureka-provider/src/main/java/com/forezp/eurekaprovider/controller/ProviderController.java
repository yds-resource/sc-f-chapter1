package com.forezp.eurekaprovider.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author chenxingguang
 * @date 2021/06/02  15:15
 **/
@RestController
public class ProviderController {


    @Value("${server.port}")
    String prot;
    @RequestMapping(value = "hi")
    public String home(@RequestParam(value="name") String  name){
    return  "hi"+name+",i am form port:"+prot;
    }
}
