package com.sha.springbootjwtauthorization.model;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.time.LocalDateTime;

/**
 * @author sa
 * @date 29.10.2021
 * @time 13:26
 */
@Data
@Entity
@Table(name = "jwt_refresh_token")
public class JwtRefreshToken
{
    @Id
    @Column(name = "token_id", nullable = false)
    private String tokenId;

    @Column(name = "user_id", nullable = false)
    private Long userId;

    @Column(name = "create_date", nullable = false)
    private LocalDateTime createDate;

    @Column(name = "expiration_date", nullable = false)
    private LocalDateTime expirationDate;
}
