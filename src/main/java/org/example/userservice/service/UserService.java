package org.example.userservice.service;

import org.example.userservice.model.UserEntity;

import java.util.Optional;

public interface UserService {
    UserEntity createUser(UserEntity user);

    Optional<UserEntity> getUserById(Long Id);

    void deleteUserById(Long id);
}