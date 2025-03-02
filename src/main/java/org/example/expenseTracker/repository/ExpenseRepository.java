package org.example.expenseTracker.repository;

import org.example.expenseTracker.model.Expense;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;



    @Repository
    public interface ExpenseRepository extends JpaRepository<Expense, Long> {
        List<Expense> findByCategory(String category);
}
