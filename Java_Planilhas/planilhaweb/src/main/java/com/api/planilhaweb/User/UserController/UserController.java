package com.api.planilhaweb.User.UserController;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.api.planilhaweb.User.UserModel.User;
import com.api.planilhaweb.User.UserService.Userservice;

@RestController
public class UserController {

    private final Userservice userservice;

    public UserController(Userservice userservice) {
        this.userservice = userservice;
    }

    @GetMapping("admin/user")
    public ResponseEntity<List<User>> GetUser() {

        return ResponseEntity.status(HttpStatus.OK).body(userservice.findAll());
    }

    @PostMapping("admin/users/adduser")
    public ResponseEntity<Object> AddUser(@PathVariable(value = "id") UUID id,userDto User user) {
        Optional<User> useroptional = userservice.getById(id);

        if(){

        }


        if (!useroptional.isPresent()) {

            return ResponseEntity.status(HttpStatus.CONFLICT).body("user not found");
        }

        return ResponseEntity.status(HttpStatus.CREATED).body(userservice.save(user));
    }
}
