package com.lerdev.healthcaresolutions.model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
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
    private LocalDate diagnosticDate;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "medical_register_id", nullable = false)
    @JsonBackReference
    private MedicalRegister medicalRegister;

    @OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL, mappedBy = "diagnostic")
    private List<Treatment> treatments = new ArrayList<>();
}
