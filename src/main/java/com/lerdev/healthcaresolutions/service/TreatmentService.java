package com.lerdev.healthcaresolutions.service;

import com.lerdev.healthcaresolutions.model.Treatment;

public interface TreatmentService {

    void createTreatment(Treatment treatment);
    Treatment getTreatmentById(Long id);
    void updateTreatment(Long id, Treatment treatment);
    void deleteTreatment(Long id);

}
