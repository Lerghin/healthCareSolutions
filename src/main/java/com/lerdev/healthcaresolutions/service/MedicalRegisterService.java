package com.lerdev.healthcaresolutions.service;

import com.lerdev.healthcaresolutions.model.MedicalRegister;

public interface MedicalRegisterService {

    void createMedicalRegister(MedicalRegister medicalRegister);
    MedicalRegister getMedicalRegisterById(Long id);
    void updateMedicalRegister(Long id, MedicalRegister medicalRegister);
    void deleteMedicalRegister(Long id);
}
