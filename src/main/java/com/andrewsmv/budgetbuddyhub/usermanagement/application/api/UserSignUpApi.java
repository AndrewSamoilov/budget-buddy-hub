package com.andrewsmv.budgetbuddyhub.usermanagement.application.api;

import com.andrewsmv.budgetbuddyhub.usermanagement.application.api.dto.in.SignUpDto;
import com.andrewsmv.budgetbuddyhub.usermanagement.application.api.dto.out.TokenDto;

public interface UserSignUpApi {
    TokenDto signUp(SignUpDto user);
}
