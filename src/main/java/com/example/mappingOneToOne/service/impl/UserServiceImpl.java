package com.example.mappingOneToOne.service.impl;

import com.example.mappingOneToOne.repository.UserRepository;
import com.example.mappingOneToOne.model.UserModel;
import com.example.mappingOneToOne.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public UserModel create(UserModel userModel) {
        return userRepository.save(userModel);
    }

    @Override
    public List<UserModel> getAll() {
        return userRepository.findAll();
    }
}
