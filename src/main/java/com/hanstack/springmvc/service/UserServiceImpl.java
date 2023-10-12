package com.hanstack.springmvc.service;

import com.hanstack.springmvc.model.User;
import com.hanstack.springmvc.repository.UserRepository;
import com.hanstack.springmvc.service.Impl.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    UserRepository userRepository;

    @Override
    public List<User> getAllUser() {
        return userRepository.findAll();
    }

    @Override
    public User getUserByNameAndPassword(String name, String password) {
        return userRepository.findByUsernameAndPassword(name, password);
    }

}
