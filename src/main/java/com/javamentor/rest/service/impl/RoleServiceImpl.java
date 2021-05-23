package com.javamentor.rest.service.impl;

import com.javamentor.rest.model.Role;
import com.javamentor.rest.repository.RoleRepository;
import com.javamentor.rest.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
public class RoleServiceImpl implements RoleService {

    @Autowired
    private RoleRepository roleRepository;

    @Override
    @Transactional
    public Role findByRole(String nameRoles) {
        return roleRepository.findRoleByNameRoles(nameRoles);
    }

    @Override
    @Transactional
    public List<Role> listRoles() {
        return roleRepository.findAll();
    }
}
