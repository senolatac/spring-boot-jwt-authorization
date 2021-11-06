package com.sha.springbootjwtauthorization.service;

import com.sha.springbootjwtauthorization.model.User;

/**
 * @author sa
 * @date 29.10.2021
 * @time 13:55
 */
public interface AuthenticationService
{
    User signInAndReturnJWT(User signInRequest);
}
