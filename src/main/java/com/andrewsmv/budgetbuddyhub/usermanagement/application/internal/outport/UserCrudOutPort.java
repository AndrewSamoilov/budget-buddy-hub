package com.andrewsmv.budgetbuddyhub.usermanagement.application.internal.outport;

import com.andrewsmv.budgetbuddyhub.usermanagement.model.UserModel;

public interface UserCrudOutPort {
    UserModel create(UserModel user);
}
