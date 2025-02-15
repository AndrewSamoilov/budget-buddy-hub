package com.andrewsmv.budgetbuddyhub.usermanagement.application.internal.service.impl;

import com.andrewsmv.budgetbuddyhub.usermanagement.application.internal.outport.UserCrudOutPort;
import com.andrewsmv.budgetbuddyhub.usermanagement.application.internal.service.UserService;
import com.andrewsmv.budgetbuddyhub.usermanagement.model.UserModel;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {

    private final UserCrudOutPort userCrudOutPort;

    @Override
    public UserModel create(UserModel user) {
        return userCrudOutPort.create(user);
    }
}
