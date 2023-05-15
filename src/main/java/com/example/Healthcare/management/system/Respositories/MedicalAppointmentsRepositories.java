package com.example.Healthcare.management.system.Respositories;

import com.example.Healthcare.management.system.Models.MedicalAppointments;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MedicalAppointmentsRepositories extends JpaRepository<MedicalAppointments, Integer> {
}
