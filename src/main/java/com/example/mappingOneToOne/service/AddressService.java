package com.example.mappingOneToOne.service;

import com.example.mappingOneToOne.model.AddressModel;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface AddressService {

    // post
    AddressModel create(AddressModel addressModel);

    // get
    List<AddressModel> getAll();
}
