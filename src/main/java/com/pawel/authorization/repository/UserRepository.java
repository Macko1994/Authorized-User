package com.pawel.authorization.repository;


import com.pawel.authorization.model.User;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface UserRepository extends CrudRepository<User, Integer> {

    Optional<User> findByUserName(String userName);
}
