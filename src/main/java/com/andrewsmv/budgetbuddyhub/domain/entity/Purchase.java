package com.andrewsmv.budgetbuddyhub.domain.entity;

import com.andrewsmv.budgetbuddyhub.domain.enums.Currency;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Purchase {
    private Long id;
    private Currency currency;
    private BigDecimal amount;
    private String description;
}
