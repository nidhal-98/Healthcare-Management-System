package com.example.Healthcare.management.system.Respositories;

import com.example.Healthcare.management.system.Models.Patients;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PatientsRespositories extends JpaRepository<Patients, Integer> {
}
