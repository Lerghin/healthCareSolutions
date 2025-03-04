package com.lerdev.healthcaresolutions.controller;


import com.lerdev.healthcaresolutions.config.MedicalRegisterRequest;
import com.lerdev.healthcaresolutions.model.*;
import com.lerdev.healthcaresolutions.service.MedicalRegisterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/medical-reg")
@PreAuthorize("denyAll")

public class MedicalRegController {


    @Autowired
    private MedicalRegisterService medicalRegisterService;

    @GetMapping
    @PreAuthorize("isAuthenticated()")
    public List<MedicalRegister> getAllMedicalReg(){
        return medicalRegisterService.getAllMedicalRegister();
    }

    @PostMapping
    @PreAuthorize("isAuthenticated()")
    public ResponseEntity<?> createMedicalReg(@RequestBody MedicalRegister medicalRegister) {
        medicalRegisterService.createMedicalRegister(medicalRegister);
        return ResponseEntity.ok().build();
    }



}
