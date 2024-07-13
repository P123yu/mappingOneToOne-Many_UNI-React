package com.example.mappingOneToOne.repository;

import com.example.mappingOneToOne.model.AddressModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AddressRepository extends JpaRepository<AddressModel,Long> {
}
