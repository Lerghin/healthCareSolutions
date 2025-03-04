package com.lerdev.healthcaresolutions.service.imp;

import com.lerdev.healthcaresolutions.model.Patient;
import com.lerdev.healthcaresolutions.repository.PatientRepository;
import com.lerdev.healthcaresolutions.service.PatientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PatientServiceImp implements PatientService {

    @Autowired
    private PatientRepository patientRepository;
    @Override
    public void createPatient(Patient patient) {
     patientRepository.save(patient);
    }

    @Override
    public Patient getPatientById(Long id) {
        return patientRepository.findById(id).orElseThrow(null);
    }

    @Override
    public void updatePatient(Long id, Patient patient) {
     patientRepository.save(patient);
    }

    @Override
    public void deletePatient(Long id) {
        patientRepository.deleteById(id);
    }
}
