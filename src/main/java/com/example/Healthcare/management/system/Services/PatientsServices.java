package com.example.Healthcare.management.system.Services;

import com.example.Healthcare.management.system.Models.Patients;
import com.example.Healthcare.management.system.Respositories.PatientsRespositories;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PatientsServices {

    @Autowired
    PatientsRespositories patientsRespositories;

    public List<Patients> getAllPatients(){
        return patientsRespositories.findAll();
    }
}
