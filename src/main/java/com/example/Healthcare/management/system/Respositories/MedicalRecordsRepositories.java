package com.example.Healthcare.management.system.Respositories;

import com.example.Healthcare.management.system.Models.MedicalRecords;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MedicalRecordsRepositories extends JpaRepository<MedicalRecords, Integer> {
}
