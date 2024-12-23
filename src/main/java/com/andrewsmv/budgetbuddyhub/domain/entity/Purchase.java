package com.andrewsmv.budgetbuddyhub.domain.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.time.LocalDate;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Purchase {
    private Long id;
    private BigDecimal amount;
    private String description;
    private LocalDate date;
    private Category category;
}
