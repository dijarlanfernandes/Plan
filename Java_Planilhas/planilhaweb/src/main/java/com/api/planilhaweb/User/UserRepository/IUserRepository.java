package com.api.planilhaweb.User.UserRepository;

import java.util.UUID;
import org.springframework.data.jpa.repository.JpaRepository;

import com.api.planilhaweb.User.UserModel.User;

public interface IUserRepository extends JpaRepository<User, UUID> {

}
