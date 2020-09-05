package com.atguigu.bean;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import java.io.Serializable;

@Component
@ConfigurationProperties(prefix = "user")
public class User implements Serializable {
    private String lastName;
    private Integer age;

    @Override
    public String toString() {
        return "User{" +
                "lastName='" + lastName + '\'' +
                ", age=" + age +
                '}';
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}
