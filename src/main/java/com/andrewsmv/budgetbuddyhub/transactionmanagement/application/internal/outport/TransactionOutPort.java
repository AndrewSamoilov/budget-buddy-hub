package com.andrewsmv.budgetbuddyhub.transactionmanagement.application.internal.outport;

import com.andrewsmv.budgetbuddyhub.transactionmanagement.application.api.dto.TransactionDto;
import com.andrewsmv.budgetbuddyhub.transactionmanagement.model.TransactionModel;

public interface TransactionOutPort {
    TransactionModel create(TransactionModel transaction);
}
