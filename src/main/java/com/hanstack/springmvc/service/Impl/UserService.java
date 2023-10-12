package com.hanstack.springmvc.service.Impl;

import com.hanstack.springmvc.model.User;

import java.util.List;

public interface UserService {
    List<User> getAllUser();

    User getUserByNameAndPassword(String name, String password);
}
