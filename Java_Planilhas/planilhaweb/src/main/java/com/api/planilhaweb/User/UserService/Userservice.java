package com.api.planilhaweb.User.UserService;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;

import com.api.planilhaweb.User.UserModel.User;
import com.api.planilhaweb.User.UserRepository.IUserRepository;

public class Userservice {
    @Autowired
    private final IUserRepository useRepository;

    public Userservice(IUserRepository useRepository) {
        this.useRepository = useRepository;
    }

    public List<User> findAll() {
        return useRepository.findAll();
    }

    public Optional<User> getById(@PathVariable(value = "id") UUID id) {
        return useRepository.findById(id);
    }

    public Object save(User user) {
        return null;
    }

}
