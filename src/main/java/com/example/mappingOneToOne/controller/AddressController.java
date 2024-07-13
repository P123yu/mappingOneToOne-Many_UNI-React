package com.example.mappingOneToOne.controller;


import com.example.mappingOneToOne.model.AddressModel;
import com.example.mappingOneToOne.service.AddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/address")
public class AddressController {

    @Autowired
    private AddressService addressService;

    @PostMapping("/post")
    public ResponseEntity<?>postData(@RequestBody AddressModel addressModel){
        AddressModel address=addressService.create(addressModel);
        if(address !=null){
            return ResponseEntity.ok(address);
        }
        else{
            return ResponseEntity.badRequest().body("Failed to create address");
        }
    }

    @GetMapping("/get")
    public ResponseEntity<?> getAllData(){
        List<AddressModel> allAddress=addressService.getAll();
        if(!allAddress.isEmpty()){
            return ResponseEntity.ok(allAddress);
        }
        else{
            return ResponseEntity.noContent().build();
        }

    }


}
