package com.timothy.nacosconsumer.controller;

import com.timothy.nacosconsumer.config.ConfigProperties;
import lombok.extern.log4j.Log4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author yutimothy
 * @Date 2020/9/3 21:22
 * @Version 1.0
 */
@RequestMapping(value = "/test", produces = {"application/json;charset=UTF-8"})
@RestController
public class TestController {

    private static final String Nacos_Provider = "http://nacos-provider";

    @Autowired
    RestTemplate template;

    @RequestMapping()
    public String index() {
        return template.getForObject(Nacos_Provider + "/test", String.class);
    }

    @PostMapping()
    public String post(@RequestParam(value = "name", required = false, defaultValue = "timothy") String name) {
        System.out.println(name);
        return template.postForObject(Nacos_Provider + "/test", name, String.class);
    }

    @RequestMapping("/json")
    public Object json(ConfigProperties configProperties) {
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("code", 200);
        map.put("message", "ok");
        map.put("data", configProperties);
        return map;
    }
}
