package com.nks.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nks.demo.entity.User;

public interface UserReposiory extends JpaRepository<User, Long> {

	User findByUsername(String name);
}
