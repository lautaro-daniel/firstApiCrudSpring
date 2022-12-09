package com.h2.firstapih2.repository;

import com.h2.firstapih2.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {

}
