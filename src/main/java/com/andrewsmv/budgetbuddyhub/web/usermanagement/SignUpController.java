package com.andrewsmv.budgetbuddyhub.web.usermanagement;

import com.andrewsmv.budgetbuddyhub.usermanagement.application.api.UserSignUpApi;
import com.andrewsmv.budgetbuddyhub.usermanagement.application.api.dto.in.SignUpDto;
import com.andrewsmv.budgetbuddyhub.usermanagement.application.api.dto.out.TokenDto;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/signup")
@RequiredArgsConstructor
public class SignUpController {

    private final UserSignUpApi userSignUpApi;

    @PostMapping
    public TokenDto signUp(@RequestBody SignUpDto user) {
        return userSignUpApi.signUp(user);
    }


    SignUpDto sign = SignUpDto.builder()
            .email("")
            .password("")
            .firstName("")
            .build();
}
