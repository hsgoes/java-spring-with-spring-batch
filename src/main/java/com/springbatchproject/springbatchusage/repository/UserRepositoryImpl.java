package com.springbatchproject.springbatchusage.repository;

import com.springbatchproject.springbatchusage.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepositoryImpl extends UserRepository, JpaRepository<User, Long> {
}
