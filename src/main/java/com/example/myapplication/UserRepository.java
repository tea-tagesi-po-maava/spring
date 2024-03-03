package com.example.myapplication;


import org.springframework.data.repository.PagingAndSortingRepository;

/**
 * Repository for saving new and retrieving existing {@link User}s from MongoDB
 *
 * @author Srinath
 */
public interface UserRepository extends PagingAndSortingRepository<User, String> {
}