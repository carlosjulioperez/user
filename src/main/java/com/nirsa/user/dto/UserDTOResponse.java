package com.nirsa.user.dto;

import com.nirsa.user.model.User;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class UserDTOResponse {
    private String message;
    private User user;
}
