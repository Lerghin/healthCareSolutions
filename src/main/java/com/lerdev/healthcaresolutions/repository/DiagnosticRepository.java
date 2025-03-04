package com.lerdev.healthcaresolutions.repository;

import com.lerdev.healthcaresolutions.model.Diagnostic;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DiagnosticRepository extends JpaRepository<Diagnostic, Long> {
}
