package com.andrewsmv.budgetbuddyhub.transactionmanagement.infrastructure.adapter;

import com.andrewsmv.budgetbuddyhub.transactionmanagement.application.internal.outport.TransactionOutPort;
import com.andrewsmv.budgetbuddyhub.transactionmanagement.model.TransactionModel;
import org.springframework.jdbc.object.MappingSqlQuery;
import org.springframework.stereotype.Component;

import javax.sql.DataSource;
import java.sql.ResultSet;
import java.sql.SQLException;

@Component
public class TransactionAdapter extends MappingSqlQuery<TransactionModel> implements TransactionOutPort {


    @Override
    public TransactionModel create(TransactionModel transaction) {
        return null;
    }


    public TransactionAdapter(DataSource ds) {
        super(ds, "SELECT ");
    }

    @Override
    protected TransactionModel mapRow(ResultSet rs, int rowNum) throws SQLException {
        return null;
    }
}
