package com.example.Healthcare.management.system.Services;

import com.example.Healthcare.management.system.Models.MedicalAppointments;
import com.example.Healthcare.management.system.Respositories.MedicalAppointmentsRepositories;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MedicalAppointmentsServices {

    @Autowired
    MedicalAppointmentsRepositories medicalAppointmentsRepositories;

    public List<MedicalAppointments> getAllMedicalAppointments() {
        return medicalAppointmentsRepositories.findAll();
    }
}
