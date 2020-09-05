package com.atguigu;

import com.atguigu.bean.User;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;

@MapperScan("com.atguigu.dao")
//扫描dao接口，创建代理对象
//扫描指定包下的所有Mapper接口，将动态代理的实现类对象注入Spring容器中
@SpringBootApplication
public class Application {
    public static void main(String[] args) {
        //启动springboot应用
        SpringApplication.run(Application.class, args);

    }
}
