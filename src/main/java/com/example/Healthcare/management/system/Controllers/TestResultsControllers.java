package com.example.Healthcare.management.system.Controllers;

import com.example.Healthcare.management.system.Models.TestResults;
import com.example.Healthcare.management.system.Services.TestResultsServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("TestResults")
public class TestResultsControllers {

    @Autowired
    TestResultsServices testResultsServices;

    @RequestMapping(value = "getAll", method = RequestMethod.GET)
public List<TestResults> getAllTestResults() {
        return testResultsServices.getAllTestResults();
    }
}
