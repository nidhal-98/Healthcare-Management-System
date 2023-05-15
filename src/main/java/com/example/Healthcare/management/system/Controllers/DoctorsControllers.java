package com.example.Healthcare.management.system.Controllers;

import com.example.Healthcare.management.system.Models.Doctors;
import com.example.Healthcare.management.system.Services.DoctorsServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("Doctors")
public class DoctorsControllers {

    @Autowired
    DoctorsServices doctorsServices;

    @RequestMapping(value = "getAll", method = RequestMethod.GET)
    public List<Doctors> getAllDoctors() {
        return doctorsServices.getAllDoctors();
    }
}
