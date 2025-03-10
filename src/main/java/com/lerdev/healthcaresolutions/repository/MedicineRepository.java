package com.lerdev.healthcaresolutions.repository;

import com.lerdev.healthcaresolutions.model.Medicine;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MedicineRepository extends JpaRepository<Medicine, Long> {
}
