package com.pts.watify.dao;

import com.pts.watify.model.User;
import org.springframework.data.repository.CrudRepository;

public interface UserDao extends CrudRepository<User, Long> {
}
