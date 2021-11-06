package com.sha.springbootjwtauthorization.repository;

import com.sha.springbootjwtauthorization.model.JwtRefreshToken;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author sa
 * @date 29.10.2021
 * @time 13:39
 */
public interface JwtRefreshTokenRepository extends JpaRepository<JwtRefreshToken, String>
{
}
