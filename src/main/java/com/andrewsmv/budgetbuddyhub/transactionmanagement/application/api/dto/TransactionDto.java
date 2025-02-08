package com.andrewsmv.budgetbuddyhub.transactionmanagement.application.api.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Builder;
import lombok.NonNull;

import java.math.BigDecimal;
import java.time.LocalDate;

@Builder
public record TransactionDto(@NotBlank String name,
                             @NotBlank String description,
                             @NotNull  BigDecimal amount,
                             @NotNull LocalDate createdDate) {
}
