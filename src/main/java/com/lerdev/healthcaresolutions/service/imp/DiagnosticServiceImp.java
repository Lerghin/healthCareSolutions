package com.lerdev.healthcaresolutions.service.imp;

import com.lerdev.healthcaresolutions.model.Diagnostic;
import com.lerdev.healthcaresolutions.repository.DiagnosticRepository;
import com.lerdev.healthcaresolutions.service.DiagnosticService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DiagnosticServiceImp implements DiagnosticService {
    @Autowired
    private DiagnosticRepository diagnosticRepository;
    @Override
    public void createDiagnostic(Diagnostic diagnostic) {
     diagnosticRepository.save(diagnostic);
    }

    @Override
    public Diagnostic getDiagnosticById(Long id) {
        return  diagnosticRepository.findById(id).orElseThrow(null);
    }

    @Override
    public void updateDiagnostic(Long id, Diagnostic diagnostic) {
        diagnosticRepository.save(diagnostic);
    }

    @Override
    public void deleteDiagnostic(Long id) {
       diagnosticRepository.deleteById(id);
    }
}
