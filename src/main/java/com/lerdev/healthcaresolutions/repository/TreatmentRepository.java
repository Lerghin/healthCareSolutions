package com.lerdev.healthcaresolutions.repository;

import com.lerdev.healthcaresolutions.model.Treatment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TreatmentRepository extends JpaRepository<Treatment, Long> {
}
