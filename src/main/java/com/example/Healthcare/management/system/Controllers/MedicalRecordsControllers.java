package com.example.Healthcare.management.system.Controllers;

import com.example.Healthcare.management.system.Models.MedicalRecords;
import com.example.Healthcare.management.system.Services.MedicalRecordsServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("MedicalRecords")
public class MedicalRecordsControllers {

    @Autowired
    MedicalRecordsServices medicalRecordsServices;

    @RequestMapping(value = "getAll", method = RequestMethod.GET)
    public List<MedicalRecords> getAllMedicalRecords() {
        return medicalRecordsServices.getAllMedicalRecords();
    }
}
