package com.nirsa.user.service;

import com.nirsa.user.dto.UserDTO;
import com.nirsa.user.dto.UserDTOResponse;

import org.springframework.stereotype.Component;

@Component
public interface UserService {
   UserDTOResponse createUser(UserDTO userDTO);
    
}
