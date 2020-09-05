package com.atguigu;

import com.atguigu.domain.User;
import com.atguigu.service.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.jdbc.Sql;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.boot.test.context.SpringBootTest;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class BootTest {
    @Autowired
    DataSource dataSource;

    @Autowired
    UserService userService;
    @Test
    public void test1(){
        List<User> all = userService.findAll();
        for (User user : all) {
            System.out.println("user = " + user);
        }
    }
    @Test
    public void test2() throws SQLException {
        System.out.println(dataSource.getClass());
        Connection connection = dataSource.getConnection();
        System.out.println("connection = " + connection);
        connection.close();
    }
    @Test
    public void test3() throws SQLException {
        System.out.println(dataSource.getClass());
    }
}
