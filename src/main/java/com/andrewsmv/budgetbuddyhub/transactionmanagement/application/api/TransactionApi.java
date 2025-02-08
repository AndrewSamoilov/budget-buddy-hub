package com.andrewsmv.budgetbuddyhub.transactionmanagement.application.api;

import com.andrewsmv.budgetbuddyhub.transactionmanagement.application.api.dto.TransactionDto;

public interface TransactionApi {
    TransactionDto create(TransactionDto transaction);
}
