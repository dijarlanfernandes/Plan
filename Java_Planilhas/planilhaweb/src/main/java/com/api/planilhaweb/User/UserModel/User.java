package com.api.planilhaweb.User.UserModel;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import javax.management.relation.Role;

public class User {

    private UUID id;
    private String name;
    private String Username;
    private String Password;
    List<Role> roles = new ArrayList<Role>();

    public User(UUID id, String name, String username, String password, List<Role> roles) {
        this.id = id;
        this.name = name;
        Username = username;
        Password = password;
        this.roles = roles;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUsername() {
        return Username;
    }

    public void setUsername(String username) {
        Username = username;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String password) {
        Password = password;
    }

    public List<Role> getRoles() {
        return roles;
    }

    public void setRoles(List<Role> roles) {
        this.roles = roles;
    }
}
