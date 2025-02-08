package com.andrewsmv.budgetbuddyhub.transactionmanagement.application.internal.service.impl;

import com.andrewsmv.budgetbuddyhub.transactionmanagement.application.internal.service.TransactionService;
import com.andrewsmv.budgetbuddyhub.transactionmanagement.model.TransactionModel;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class TransactionServiceImpl implements TransactionService {

    @Override
    public TransactionModel create(TransactionModel transaction) {
        return null;
    }
}
