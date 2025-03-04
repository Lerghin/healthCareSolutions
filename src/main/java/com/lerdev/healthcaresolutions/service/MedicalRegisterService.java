package com.lerdev.healthcaresolutions.service;

import com.lerdev.healthcaresolutions.model.*;

import java.util.List;
import java.util.Set;

public interface MedicalRegisterService {
    public List<MedicalRegister> getAllMedicalRegister();
    public MedicalRegister createMedicalRegister(MedicalRegister medicalRegister);
    MedicalRegister getMedicalRegisterById(Long id);
    void updateMedicalRegister(Long id, MedicalRegister medicalRegister);
    void deleteMedicalRegister(Long id);
}
