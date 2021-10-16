package com.pts.watify.dao;

import com.pts.watify.model.Transaction;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(exported = false)
public interface TransactionDao extends CrudRepository<Transaction, Long> {
}
