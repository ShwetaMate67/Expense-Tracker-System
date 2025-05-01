package com.archer.Expense_Tracker.repo;

import java.util.Optional;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import com.archer.Expense_Tracker.model.Cost;

public interface ExpenseRepo extends MongoRepository<Cost, String> {
	
	@Query("{'name': ?0}")
	Optional<Cost> findByName(String name);
	
}
