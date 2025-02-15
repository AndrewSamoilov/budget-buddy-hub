package com.andrewsmv.budgetbuddyhub.usermanagement.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class UserModel {
    private String email;
    private String password;
    private String firstName;
    private String lastName;
}
