package com.example.mappingOneToOne.service;

import com.example.mappingOneToOne.model.UserModel;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface UserService {

    // create
    UserModel create(UserModel userModel);

    // getAll
    List<UserModel> getAll();
}
