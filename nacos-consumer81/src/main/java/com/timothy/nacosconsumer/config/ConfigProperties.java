package com.timothy.nacosconsumer.config;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * @Author yutimothy
 * @Date 2020/9/3 21:31
 * @Version 1.0
 */
@Data
@Component
@Setter
@Getter
@ConfigurationProperties(prefix = "config")
public class ConfigProperties {
    private String id;
    private String version;
}
