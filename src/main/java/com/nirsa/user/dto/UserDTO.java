package com.nirsa.user.dto;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class UserDTO {
    
    private String name;
    
    private String password;
    
}
