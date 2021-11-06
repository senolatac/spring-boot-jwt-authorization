package com.sha.springbootjwtauthorization.service;

import com.sha.springbootjwtauthorization.model.JwtRefreshToken;
import com.sha.springbootjwtauthorization.model.User;

/**
 * @author sa
 * @date 29.10.2021
 * @time 13:41
 */
public interface JwtRefreshTokenService
{
    JwtRefreshToken createRefreshToken(Long userId);

    User generateAccessTokenFromRefreshToken(String refreshTokenId);
}
