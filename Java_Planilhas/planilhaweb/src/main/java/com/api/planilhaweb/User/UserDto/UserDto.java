package com.api.planilhaweb.User.UserDto;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class UserDto {
    private UUID id;
    private String name;
    private String Username;
    private String Password;
    List<Role> roles = new ArrayList();
}
