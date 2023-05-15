package com.example.Healthcare.management.system.Respositories;

import com.example.Healthcare.management.system.Models.Prescriptions;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PrescriptionsRepositories extends JpaRepository<Prescriptions, Integer> {
}
