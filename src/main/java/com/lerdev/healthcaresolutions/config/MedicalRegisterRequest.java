package com.lerdev.healthcaresolutions.config;
import com.lerdev.healthcaresolutions.model.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

import lombok.Getter;
import lombok.Setter;
import java.util.List;
import java.util.Set;

@Getter
@Setter
public class MedicalRegisterRequest {
    private Patient patient;
    private MedicalRegister medicalRegister;
    private List<Diagnostic> diagnostics;
    private List<Treatment> treatments;
    private Set<Medicine> medicines;
}
