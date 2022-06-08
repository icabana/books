package com.example.books.service;

import com.example.books.model.User;
import com.example.books.repository.IUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ImplUserService implements IUserService {

    private final IUserRepository iUserRepository;

    public ImplUserService(@Autowired IUserRepository iUserRepository) {
        this.iUserRepository = iUserRepository;
    }

    @Override
    public List<User> findAllUser() {
        return iUserRepository.findAll();
    }

    @Override
    public User createUser(User user) {
        return iUserRepository.save(user);
    }

    @Override
    public Optional<User> findByIdUser(Integer id) {
        return iUserRepository.findById(id);
    }

    @Override
    public void deleteUser(Integer id) {
        iUserRepository.deleteById(id);
    }

    @Override
    public User updateUser(User user) {
        return iUserRepository.save(user);
    }

}
