package com.springsecurityjwt.springsecurityjwt.payload.request;

import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class AuthRequest {
    private String username;
    private String password;
}
