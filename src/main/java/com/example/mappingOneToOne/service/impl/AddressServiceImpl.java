package com.example.mappingOneToOne.service.impl;


import com.example.mappingOneToOne.model.AddressModel;
import com.example.mappingOneToOne.repository.AddressRepository;
import com.example.mappingOneToOne.service.AddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AddressServiceImpl implements AddressService {

    @Autowired
    private AddressRepository addressRepository;


    @Override
    public AddressModel create(AddressModel addressModel) {
        return  addressRepository.save(addressModel);
    }

    @Override
    public List<AddressModel> getAll() {
        return  addressRepository.findAll();
    }
}
