package com.nirsa.user.repository;

import com.nirsa.user.model.User;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @Repository makes the interface a bean as @Component annotation.
 * Extending of JpaRepository we inherit the save, findAll, findById methods.
 */
@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    
}
