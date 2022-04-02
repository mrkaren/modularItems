package com.example.modularitems.common.repository;

import com.example.modularitems.common.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Integer> {
}
