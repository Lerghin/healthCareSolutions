package com.lerdev.healthcaresolutions.service.imp;

import com.lerdev.healthcaresolutions.model.MedicalRegister;
import com.lerdev.healthcaresolutions.repository.MedicalRegisterRepository;
import com.lerdev.healthcaresolutions.service.MedicalRegisterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MedicalRegisterServiceImp implements MedicalRegisterService {
    @Autowired
    private MedicalRegisterRepository medicalRegisterRepository;
    @Override
    public void createMedicalRegister(MedicalRegister medicalRegister) {
     medicalRegisterRepository.save(medicalRegister);
    }

    @Override
    public MedicalRegister getMedicalRegisterById(Long id) {
        return medicalRegisterRepository.findById(id).orElseThrow(null);
    }

    @Override
    public void updateMedicalRegister(Long id, MedicalRegister medicalRegister) {
     medicalRegisterRepository.save(medicalRegister);
    }

    @Override
    public void deleteMedicalRegister(Long id) {
      medicalRegisterRepository.deleteById(id);
    }
}
