package com.example.Healthcare.management.system.Respositories;

import com.example.Healthcare.management.system.Models.TestResults;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TestResultsRepositories extends JpaRepository<TestResults, Integer> {
}
