package com.example.Healthcare.management.system.Services;

import com.example.Healthcare.management.system.Models.Doctors;
import com.example.Healthcare.management.system.Respositories.DoctorsRepositories;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DoctorsServices {

    @Autowired
    DoctorsRepositories doctorsRepositories;

    public List<Doctors> getAllDoctors(){
        return doctorsRepositories.findAll();
    }
}
