package com.example.Healthcare.management.system.Controllers;

import com.example.Healthcare.management.system.Models.MedicalAppointments;
import com.example.Healthcare.management.system.Services.MedicalAppointmentsServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("Appointments")
public class MedicalAppointmentsControllers {

    @Autowired
    MedicalAppointmentsServices medicalAppointmentsServices;

    @RequestMapping(value = "getAll", method = RequestMethod.GET)
    public List<MedicalAppointments> getAllMedicalAppointments(){
        return medicalAppointmentsServices.getAllMedicalAppointments();
    }
}
