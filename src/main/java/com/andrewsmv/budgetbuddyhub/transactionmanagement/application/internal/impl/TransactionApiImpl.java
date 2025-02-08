package com.andrewsmv.budgetbuddyhub.transactionmanagement.application.internal.impl;

import com.andrewsmv.budgetbuddyhub.transactionmanagement.application.api.TransactionApi;
import com.andrewsmv.budgetbuddyhub.transactionmanagement.application.api.dto.TransactionDto;
import org.springframework.stereotype.Component;

@Component
public class TransactionApiImpl implements TransactionApi {



    @Override
    public TransactionDto create(TransactionDto transaction) {
        return null;
    }
}
