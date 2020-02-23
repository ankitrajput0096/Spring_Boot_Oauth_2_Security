package com.springbootsecurity.secureapplication.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springbootsecurity.secureapplication.model.Role;
import com.springbootsecurity.secureapplication.repository.RoleRepository;

@Service
public class RoleService {

    private RoleRepository roleRepository;

    @Autowired
    public RoleService(RoleRepository roleRepository) {
        this.roleRepository = roleRepository;
    }

    public Role findByRole(String roleStr) {
        return roleRepository.findByRole(roleStr);
    }

    public Role saveRole(String role) {
        Role roleObj = new Role(role);
        roleRepository.save(roleObj);
        return roleObj;
    }
}
