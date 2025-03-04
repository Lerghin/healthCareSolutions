package com.lerdev.healthcaresolutions.repository;

import com.lerdev.healthcaresolutions.model.Patient;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PatientRepository extends JpaRepository<Patient, Long> {
}
