package com.pts.watify.dao;

import com.pts.watify.model.Client;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;

@RepositoryRestResource(exported = false)
public interface ClientDao extends CrudRepository<Client, Long> {
}
