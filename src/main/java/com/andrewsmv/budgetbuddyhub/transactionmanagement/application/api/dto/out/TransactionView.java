package com.andrewsmv.budgetbuddyhub.transactionmanagement.application.api.dto.out;

import lombok.Builder;

import java.math.BigDecimal;
import java.time.LocalDate;

@Builder
public record TransactionView(String name,
                              String description,
                              BigDecimal amount,
                              LocalDate createdDate) {
}
