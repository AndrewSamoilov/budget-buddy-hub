package com.andrewsmv.budgetbuddyhub.usermanagement.infrastructure.repository;

import com.andrewsmv.budgetbuddyhub.usermanagement.infrastructure.entity.User;

public interface UserRepository {
    boolean existsByEmail(String email);

    User create(User user);
}
