package com.andrewsmv.budgetbuddyhub.transactionmanagement.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.time.LocalDate;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class TransactionModel {
    private String name;
    private String description;
    private BigDecimal amount;
    private LocalDate createdDate;
}
