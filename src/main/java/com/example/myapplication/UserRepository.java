package com.example.myapplication.repository;

import com.example.myapplication.User;
import org.springframework.data.repository.PagingAndSortingRepository;

/**
 * Repository for saving new and retrieving existing {@link User}s from MongoDB
 *
 * @author Srinath
 */
public interface UserRepository extends PagingAndSortingRepository<User, String> {
    // You can define additional methods here if needed
}
