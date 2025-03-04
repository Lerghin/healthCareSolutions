package com.lerdev.healthcaresolutions.service;

import com.lerdev.healthcaresolutions.model.Patient;

public interface PatientService {

    void createPatient(Patient patient);
    Patient getPatientById(Long id);
    void updatePatient(Long id, Patient patient);
    void deletePatient(Long id);
}
