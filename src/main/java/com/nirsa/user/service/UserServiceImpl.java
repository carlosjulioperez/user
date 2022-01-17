package com.nirsa.user.service;

import com.nirsa.user.dto.UserDTO;
import com.nirsa.user.dto.UserDTOResponse;
import com.nirsa.user.model.User;
import com.nirsa.user.repository.UserRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService{

    @Autowired
    UserRepository userRepository;

    @Override
    public UserDTOResponse createUser(UserDTO userDTO) {
        User user = userRepository.save(User.from(userDTO));
        return new UserDTOResponse("Se ha creado el usuario", user);
    }
    
}
