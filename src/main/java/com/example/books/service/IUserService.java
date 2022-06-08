package com.example.books.service;

import com.example.books.model.User;

import java.util.List;
import java.util.Optional;

public interface IUserService {

    List<User> findAllUser();

    User createUser(User user);

    Optional<User> findByIdUser(Integer id);

    void deleteUser(Integer id);

    User updateUser(User user);

}
