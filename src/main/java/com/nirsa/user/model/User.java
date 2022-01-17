package com.nirsa.user.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.nirsa.user.dto.UserDTO;

import lombok.Data;

@Entity
@Data
public class User {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    
    @Column(unique=true)
    private String email;
    
    private String password;
 
    public static User from(UserDTO userDTO){
        User user = new User();
        user.setName(userDTO.getName());
        user.setPassword(userDTO.getPassword());
        return user;
    }
}
