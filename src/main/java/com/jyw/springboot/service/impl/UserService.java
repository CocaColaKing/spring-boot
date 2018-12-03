package com.jyw.springboot.service.impl;

import com.jyw.springboot.mapper.UserMapper;
import com.jyw.springboot.model.User;
import com.jyw.springboot.service.IUser;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author jiangyw
 * @date 2018/12/3 16:18
 */
@Service("userService")
public class UserService implements IUser {
    @Resource
    private UserMapper userMapper;

    @Override
    public User getByUid(String uid) {
        return null;
    }

    @Override
    public User getByMobile(String mobile) {
        return null;
    }

    @Override
    public List<User> listAllUser() {
        return null;
    }

    @Override
    public User getById(int id) {
        return userMapper.selectByPrimaryKey(id);
    }
}
