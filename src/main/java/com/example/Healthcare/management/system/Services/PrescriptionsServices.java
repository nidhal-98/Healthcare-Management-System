package com.example.Healthcare.management.system.Services;

import com.example.Healthcare.management.system.Models.Prescriptions;
import com.example.Healthcare.management.system.Respositories.PrescriptionsRepositories;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PrescriptionsServices {

    @Autowired
    PrescriptionsRepositories prescriptionsRepositories;

    public List<Prescriptions> getAllPrescriptions(){
        return prescriptionsRepositories.findAll();
    }
}
