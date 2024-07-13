package com.example.mappingOneToOne.controller;

import com.example.mappingOneToOne.model.UserModel;
import com.example.mappingOneToOne.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/user")
@CrossOrigin

public class UserController {


    @Autowired
    private UserService userService;

    @PostMapping("/post")
    public ResponseEntity<?> postData(@RequestBody UserModel addressModel){
        UserModel address=userService.create(addressModel);
        if(address !=null){
            return ResponseEntity.ok(address);
        }
        else{
            return ResponseEntity.badRequest().body("Failed to create address");
        }
    }

    @GetMapping("/get")
    public ResponseEntity<?> getAllData(){
        List<UserModel> allAddress=userService.getAll();
        if(!allAddress.isEmpty()){
            return ResponseEntity.ok(allAddress);
        }
        else{
            return ResponseEntity.noContent().build();
        }

    }

}
