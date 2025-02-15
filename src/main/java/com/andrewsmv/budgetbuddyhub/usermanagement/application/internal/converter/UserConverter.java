package com.andrewsmv.budgetbuddyhub.usermanagement.application.internal.converter;

import com.andrewsmv.budgetbuddyhub.usermanagement.application.api.dto.in.SignUpDto;
import com.andrewsmv.budgetbuddyhub.usermanagement.model.UserModel;
import lombok.RequiredArgsConstructor;
import org.springframework.core.convert.converter.Converter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class UserConverter implements Converter<SignUpDto, UserModel> {

    private final BCryptPasswordEncoder bCryptPasswordEncoder;

    @Override
    public UserModel convert(SignUpDto signUpDto) {
        return UserModel.builder()
                .email(signUpDto.email())
                .password(bCryptPasswordEncoder.encode(signUpDto.password()))
                .firstName(signUpDto.firstName())
                .lastName(signUpDto.lastName())
                .build();
    }
}
