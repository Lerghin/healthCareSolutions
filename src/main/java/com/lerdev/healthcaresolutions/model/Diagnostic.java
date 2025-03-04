package com.lerdev.healthcaresolutions.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.HashSet;
import java.util.Set;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Table(name = "diagnostic")
public class Diagnostic {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String description;
    private String observations;
    private String diagnosticDate;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "medical_register_id")
    private MedicalRegister medicalRegister;

    @OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL, mappedBy = "diagnostic")
    private Set<Treatment> treatments = new HashSet<>();
}
