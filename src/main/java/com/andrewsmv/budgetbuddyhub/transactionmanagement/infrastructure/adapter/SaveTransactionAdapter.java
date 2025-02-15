package com.andrewsmv.budgetbuddyhub.transactionmanagement.infrastructure.adapter;

import com.andrewsmv.budgetbuddyhub.transactionmanagement.application.internal.outport.TransactionOutPort;
import com.andrewsmv.budgetbuddyhub.transactionmanagement.model.TransactionModel;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

@Slf4j
@Component
@RequiredArgsConstructor
public class SaveTransactionAdapter implements TransactionOutPort {

//    private final NamedParameterJdbcTemplate namedParameterJdbcTemplate;

    @Override
    public TransactionModel create(TransactionModel transaction) {
//        namedParameterJdbcTemplate.query("");
        return null;
    }
}
