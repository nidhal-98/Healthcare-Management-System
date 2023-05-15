package com.example.Healthcare.management.system.Controllers;

import com.example.Healthcare.management.system.Models.Prescriptions;
import com.example.Healthcare.management.system.Services.PrescriptionsServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("Prescriptions")
public class PrescriptionsControllers {

    @Autowired
    PrescriptionsServices prescriptionsServices;

    @RequestMapping(value = "getAll", method = RequestMethod.GET)
    public List<Prescriptions> getAllPrescriptions() {
        return prescriptionsServices.getAllPrescriptions();
    }
}
