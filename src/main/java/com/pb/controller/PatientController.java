package com.pb.controller;

import com.pb.entities.Patient;
import com.pb.service.PatientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins="*",allowedHeaders="*")
@RestController
public class PatientController {
    @Autowired
    PatientService patientService;

    @GetMapping(value = "/patients")
    public List<Patient> getAllPatients() {
        return patientService.getAllPatients();
    }

    @PostMapping(value = "/patient", consumes = "application/json")
    public Patient addUser(@RequestBody Patient PatientToAdd) {
        return patientService.addPatient(PatientToAdd);
    }
}
