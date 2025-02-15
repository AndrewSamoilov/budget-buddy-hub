package com.andrewsmv.budgetbuddyhub.usermanagement.infrastructure.adapter;

import com.andrewsmv.budgetbuddyhub.usermanagement.application.internal.outport.UserCrudOutPort;
import com.andrewsmv.budgetbuddyhub.usermanagement.infrastructure.entity.User;
import com.andrewsmv.budgetbuddyhub.usermanagement.infrastructure.repository.UserRepository;
import com.andrewsmv.budgetbuddyhub.usermanagement.model.UserModel;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class UserCrudAdapter implements UserCrudOutPort {

    public final UserRepository userRepository;

    @Override
    public UserModel create(UserModel user) {
        boolean existsByEmail = userRepository.existsByEmail(user.getEmail());

        if (existsByEmail) {
            throw new RuntimeException();
        }

        userRepository.create(User.builder()
                .email(user.getEmail())
                .password(user.getPassword())
                .lastName(user.getLastName())
                .firstName(user.getFirstName())
                .build());

        return user;
    }
}
