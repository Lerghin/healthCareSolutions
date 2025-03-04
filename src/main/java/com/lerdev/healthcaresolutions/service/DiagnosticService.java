package com.lerdev.healthcaresolutions.service;

import com.lerdev.healthcaresolutions.model.Diagnostic;

public interface DiagnosticService {

    void createDiagnostic(Diagnostic diagnostic);
    Diagnostic getDiagnosticById(Long id);
    void updateDiagnostic(Long id, Diagnostic diagnostic);
    void deleteDiagnostic(Long id);
}
