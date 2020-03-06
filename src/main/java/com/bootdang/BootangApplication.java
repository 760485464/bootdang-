package com.bootdang;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.FilterType;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@EnableCaching()
@EnableTransactionManagement(proxyTargetClass = true)//开启cglib
@MapperScan("com.bootdang.*.mapper")
@ComponentScan(excludeFilters = {
        @ComponentScan.Filter(type = FilterType.REGEX,pattern = "com.bootdang.test.*")
})
@SpringBootApplication()
public class BootangApplication {
//
    public static void main (String[] args) {
        SpringApplication.run(BootangApplication.class, args);
    }
}
