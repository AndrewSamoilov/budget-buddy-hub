package com.andrewsmv.budgetbuddyhub.transactionmanagement.application.internal.service;

import com.andrewsmv.budgetbuddyhub.transactionmanagement.application.api.dto.TransactionDto;
import com.andrewsmv.budgetbuddyhub.transactionmanagement.model.TransactionModel;

public interface TransactionService {
    TransactionModel create(TransactionModel transaction);
}
