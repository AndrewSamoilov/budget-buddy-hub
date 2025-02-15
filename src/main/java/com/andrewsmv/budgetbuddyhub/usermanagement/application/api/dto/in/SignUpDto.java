package com.andrewsmv.budgetbuddyhub.usermanagement.application.api.dto.in;

import jakarta.validation.constraints.NotBlank;
import lombok.Builder;

@Builder
public record SignUpDto(@NotBlank String email,
                        @NotBlank String password,
                        @NotBlank String firstName,
                        @NotBlank String lastName) {
}
