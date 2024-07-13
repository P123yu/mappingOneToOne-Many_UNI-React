package com.example.mappingOneToOne.repository;

import com.example.mappingOneToOne.model.UserModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<UserModel,Long> {
}
