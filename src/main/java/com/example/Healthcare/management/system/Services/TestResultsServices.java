package com.example.Healthcare.management.system.Services;

import com.example.Healthcare.management.system.Models.TestResults;
import com.example.Healthcare.management.system.Respositories.TestResultsRepositories;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TestResultsServices {

    @Autowired
    TestResultsRepositories testResultsRepositories;

    public List<TestResults> getAllTestResults() {
        return testResultsRepositories.findAll();
    }
}
