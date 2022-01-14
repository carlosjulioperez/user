package com.nirsa.user;

import javax.persistence.Entity;

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
 
}
