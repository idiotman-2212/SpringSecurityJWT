package com.springsecurityjwt.springsecurityjwt.repository;

import com.springsecurityjwt.springsecurityjwt.entity.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RoleRepository extends JpaRepository<Role, Integer> {
    Role findByName (String name);
}
