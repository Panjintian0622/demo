package com.ayeng.demo.repository;

import com.ayeng.demo.entity.Role;
import com.ayeng.demo.entity.User;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface RoleRepository extends CrudRepository<Role, Long> {
    List<Role> findRolesByUserId(Long userId);
}
