package com.sha.springbootjwtauthorization.service;

import com.sha.springbootjwtauthorization.model.Role;
import com.sha.springbootjwtauthorization.model.User;

import java.util.List;
import java.util.Optional;

/**
 * @author sa
 * @date 29.10.2021
 * @time 12:03
 */
public interface UserService
{
    User saveUser(User user);

    Optional<User> findByUsername(String username);

    void changeRole(Role newRole, String username);

    List<User> findAllUsers();
}
