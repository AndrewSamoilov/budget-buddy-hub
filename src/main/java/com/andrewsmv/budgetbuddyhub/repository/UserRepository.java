package com.andrewsmv.budgetbuddyhub.repository;

import com.andrewsmv.budgetbuddyhub.domain.entity.User;

public interface UserRepository {

    User getById(Long id);

    User create(User user);

    User update(User user);

    User delete(Long id);
}
