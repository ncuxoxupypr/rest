package com.javamentor.rest.service;

import com.javamentor.rest.model.Role;

import java.util.List;

public interface RoleService {
    Role findByRole(String nameRoles);
    List<Role> listRoles();
}
