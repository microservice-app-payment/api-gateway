package com.vn.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Collection;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class AuthenticationResponse {
    private String userId;
    private String accessToken;
    private String refreshToken;
    private Long expiresAt;
    private Collection<String> authorityList;
}
