package com.example.redis.repository;

import com.example.redis.model.User;
import java.util.List;

public interface UserDAO {
    boolean saveUser(User user);

    List<User> fetchAllUser();

    User fetchUserById(Long id);

    boolean deleteUser(Long id);

    boolean updateUser(Long id, User user);
}
