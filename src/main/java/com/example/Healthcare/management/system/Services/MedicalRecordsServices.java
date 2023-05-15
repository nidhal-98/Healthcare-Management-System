package com.example.Healthcare.management.system.Services;

import com.example.Healthcare.management.system.Models.MedicalRecords;
import com.example.Healthcare.management.system.Respositories.MedicalRecordsRepositories;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MedicalRecordsServices {

    @Autowired
    MedicalRecordsRepositories medicalRecordsRepositories;

    public List<MedicalRecords> getAllMedicalRecords() {
        return medicalRecordsRepositories.findAll();
    }
}
