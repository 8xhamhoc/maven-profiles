package com.csam.wsc.swisscard.dip.cache.dao.entity;

import ch.swisscard.serviceobjects.transactionmanagement.TransactionType;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.UUID;

@Document(collection = "SwisscardTransaction")
public class SwisscardTransaction extends SwisscardBase {

    private static final long serialVersionUID = 6838097584346120709L;
    @Id
    private String id = UUID.randomUUID().toString();
    private TransactionType transactionType;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public TransactionType getTransactionType() {
        return transactionType;
    }

    public void setTransactionType(TransactionType transactionType) {
        this.transactionType = transactionType;
    }
}
