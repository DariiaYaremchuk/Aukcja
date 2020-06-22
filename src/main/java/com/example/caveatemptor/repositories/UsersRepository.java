package com.example.caveatemptor.repositories;

import com.example.caveatemptor.models.Items;
import com.example.caveatemptor.models.Users;
import org.springframework.data.repository.CrudRepository;

public interface UsersRepository extends CrudRepository <Users,Long> {
    //Users findByUsers_id(Long id);
    Users findByuserName(String usersName);
}
