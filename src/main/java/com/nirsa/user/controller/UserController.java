package com.nirsa.user.controller;

import javax.validation.Valid;

import com.nirsa.user.dto.UserDTO;
import com.nirsa.user.dto.UserDTOResponse;
import com.nirsa.user.service.UserService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.annotations.ApiResponses;

@RestController
@RequestMapping("/user")
@ApiResponses(value = {
    @io.swagger.annotations.ApiResponse(code = 400, message = "This is a bad request, please follow the API documentation for the proper request format"),
    @io.swagger.annotations.ApiResponse(code = 401, message = "Due to security constraints, your access request cannot be authorized"),
    @io.swagger.annotations.ApiResponse(code = 500, message = "The server is down. Please bear with us."),
})
public class UserController {
    
    @Autowired
    UserService userService;

    @PostMapping("/add")
    public ResponseEntity<UserDTOResponse> addUser(@Valid @RequestBody UserDTO userDTO){
        UserDTOResponse userDTOResponse = userService.createUser(userDTO);
        return new ResponseEntity<>(userDTOResponse, HttpStatus.CREATED);
    }

}
