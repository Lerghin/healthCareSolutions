package com.lerdev.healthcaresolutions.service.imp;

import com.lerdev.healthcaresolutions.model.*;
import com.lerdev.healthcaresolutions.repository.*;
import com.lerdev.healthcaresolutions.service.MedicalRegisterService;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Service
public class MedicalRegisterServiceImp implements MedicalRegisterService {
    @Autowired
    private MedicalRegisterRepository medicalRegisterRepository;

    @Autowired
    private PatientRepository patientRepository;
    @Autowired
    private DiagnosticRepository diagnosticRepository;

    @Autowired
    private TreatmentRepository treatmentRepository;

    @Autowired
    private MedicineRepository medicineRepository;



    public List<MedicalRegister> getAllMedicalRegister(){
        return medicalRegisterRepository.findAll();
    }

    @Transactional
    @Override
    public MedicalRegister createMedicalRegister(MedicalRegister medicalRegister) {
        // Save patient
        Patient patient = medicalRegister.getPatient();
        patientRepository.save(patient);

        // Save MedicalRegister first
        medicalRegisterRepository.save(medicalRegister);

        // Save Diagnostics
        createDiagnostic(medicalRegister);

        // Save Treatments
        List<Diagnostic> diagnostics = medicalRegister.getDiagnostics();
        for (Diagnostic diagnostic : diagnostics) {
            createTreatment(diagnostic);
        }

        // Save Medicines
        for (Diagnostic diagnostic : diagnostics) {
            List<Treatment> treatments = diagnostic.getTreatments();
            for (Treatment treatment : treatments) {
                createMedicine(treatment);
            }
        }

        return medicalRegister;
    }

    public void createDiagnostic(MedicalRegister medicalRegister){
        List<Diagnostic> diagnostics = medicalRegister.getDiagnostics();
        for(Diagnostic diagnostic : diagnostics){
            diagnostic.setMedicalRegister(medicalRegister);
            diagnosticRepository.save(diagnostic);
        }
    }

    public void createTreatment(Diagnostic diagnostic){
        List<Treatment> treatments = diagnostic.getTreatments();
        for(Treatment treatment : treatments){
            treatment.setDiagnostic(diagnostic);
            treatmentRepository.save(treatment);
        }

    }

    public  void createMedicine(Treatment treatment){
        Set<Medicine> medicines = treatment.getMedicines();
        for(Medicine medicine : medicines){
            medicine.setTreatment(treatment);
            medicineRepository.save(medicine);
        }
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
