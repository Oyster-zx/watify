package com.pts.watify.dao;

import com.pts.watify.model.Transaction;
import org.springframework.data.repository.CrudRepository;

public interface TransactionDao extends CrudRepository<Transaction, Long> {
}
