package com.atguigu.ggkt.vod;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * 类说明：vod 模块启动类
 *
 * @author syx
 * @date 2022-07-03 9:30
 */
@SpringBootApplication
public class ServiceVodApplication {
    public static void main(String[] args) {
        SpringApplication.run(ServiceVodApplication.class, args);
    }
}