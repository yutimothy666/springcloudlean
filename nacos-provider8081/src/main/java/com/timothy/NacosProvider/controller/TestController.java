package com.timothy.NacosProvider.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

/**
 * @Author yutimothy
 * @Date 2020/9/2 20:19
 * @Version 1.0
 */
@RestController
@RequestMapping("/test")
public class TestController {

    @Value("${server.port}")
    private String port;

    @GetMapping()
    public String index() {
        return "index for" + port;
    }

    @PostMapping
    public String post(@RequestBody String name) {
        return name + "from:" + port;
    }
}
