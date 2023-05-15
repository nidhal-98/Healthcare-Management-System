package com.example.Healthcare.management.system.Respositories;

import com.example.Healthcare.management.system.Models.Doctors;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DoctorsRepositories extends JpaRepository<Doctors, Integer> {
}
