package com.jyw.springboot.service;

import com.jyw.springboot.model.User;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author jiangyw
 * @date 2018/12/3 16:18
 */
@Repository("userMapper")
public interface IUser {
    User getByUid(String uid);
    User getByMobile(String mobile);
    List<User> listAllUser();
    User getById(int id);
}
