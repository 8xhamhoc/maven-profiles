package com.csam.wsc.swisscard.dip.cache.dao.repository;

import com.csam.wsc.swisscard.dip.cache.dao.entity.SwisscardTransaction;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface SwisscardTransactionRepository extends MongoRepository<SwisscardTransaction, String> {

}
