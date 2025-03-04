package com.lerdev.healthcaresolutions.repository;

import com.lerdev.healthcaresolutions.model.MedicalRegister;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public  interface MedicalRegisterRepository extends JpaRepository<MedicalRegister, Long> {
}
