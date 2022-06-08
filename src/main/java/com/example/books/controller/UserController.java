package com.example.books.controller;

import com.example.books.model.User;
import com.example.books.service.IUserService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/v1/user")
public class UserController {

    private final IUserService iUserService;

    public UserController(IUserService iUserService) {
        this.iUserService = iUserService;
    }

    @GetMapping("/")
    public List<User> findAllBook(){
        return iUserService.findAllUser();
    }

    @PostMapping("/")
    public User createBook(@RequestBody User user){
        return iUserService.createUser(user);
    }

    @GetMapping("/{id}")
    public Optional<User> findByIdBook(@PathVariable Integer id){
        return iUserService.findByIdUser(id);
    }

    @DeleteMapping("/{id}")
    public void deleteBook(@PathVariable Integer id){
        iUserService.deleteUser(id);
    }

    @PutMapping("/")
    public User updateBook(@RequestBody User user){
        return iUserService.updateUser(user);
    }

}
