package com.andrewsmv.budgetbuddyhub.usermanagement.application.internal.impl;

import com.andrewsmv.budgetbuddyhub.usermanagement.application.api.UserSignUpApi;
import com.andrewsmv.budgetbuddyhub.usermanagement.application.api.dto.in.SignUpDto;
import com.andrewsmv.budgetbuddyhub.usermanagement.application.api.dto.out.TokenDto;
import com.andrewsmv.budgetbuddyhub.usermanagement.application.internal.outport.UserCrudOutPort;
import com.andrewsmv.budgetbuddyhub.usermanagement.application.internal.service.UserService;
import com.andrewsmv.budgetbuddyhub.usermanagement.model.UserModel;
import lombok.RequiredArgsConstructor;
import org.springframework.core.convert.ConversionService;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class UserSignUpApiImpl implements UserSignUpApi {

    private final UserService userService;
    private final ConversionService conversionService;

    @Override
    public TokenDto signUp(SignUpDto user) {
        UserModel userModel = userService.create(conversionService.convert(user, UserModel.class));


        return new TokenDto("lol", "kek");
    }
}
