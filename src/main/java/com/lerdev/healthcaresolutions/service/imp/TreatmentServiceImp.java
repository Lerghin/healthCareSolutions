package com.lerdev.healthcaresolutions.service.imp;


import com.lerdev.healthcaresolutions.model.Treatment;
import com.lerdev.healthcaresolutions.repository.TreatmentRepository;
import com.lerdev.healthcaresolutions.service.TreatmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TreatmentServiceImp implements TreatmentService {

    @Autowired
    private TreatmentRepository treatmentRepository;
    @Override
    public void createTreatment(Treatment treatment) {
    treatmentRepository.save(treatment);
    }

    @Override
    public Treatment getTreatmentById(Long id) {
        return treatmentRepository.findById(id).orElseThrow(null);
    }

    @Override
    public void updateTreatment(Long id, Treatment treatment) {
    treatmentRepository.save(treatment);
    }

    @Override
    public void deleteTreatment(Long id) {
     treatmentRepository.deleteById(id);
    }
}
