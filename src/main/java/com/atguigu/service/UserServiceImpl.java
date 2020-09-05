package com.atguigu.service;

import com.atguigu.dao.UserDao;
import com.atguigu.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserDao userDao;
    @Override
    public List<User> findAll() {
        return userDao.findAll();
    }
}
