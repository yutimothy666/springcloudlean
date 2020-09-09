package com.timothy.nacosconsumer.controller;

import com.timothy.nacosconsumer.config.ConfigProperties;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.lang.reflect.Field;

/**
 * @Author yutimothy
 * @Date 2020/9/3 21:30
 * @Version 1.0
 */
@RestController
@RequestMapping(value = "/config", produces = {"application/json;charset=UTF-8"})
public class ConfigController {

    @Resource
    private ConfigProperties configProperties;

    @RequestMapping()
    public Object object() {
        return configProperties;
    }

    @RequestMapping("/{name}")
    public String name(@PathVariable("name") String name) throws NoSuchFieldException, IllegalAccessException {
        Field declaredField = configProperties.getClass().getDeclaredField(name);
        declaredField.setAccessible(true);
        return (String) declaredField.get(configProperties);
    }
}
