package com.andrewsmv.budgetbuddyhub.usermanagement.application.api.dto.out;

public record TokenDto(String accessToken,
                       String refreshToken) {
}
