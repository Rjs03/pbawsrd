package com.pb.service;

import com.pb.entities.Patient;
import com.pb.repository.PatientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PatientService {
    @Autowired
    PatientRepository patientRepository;

    public Patient addPatient(Patient newPatient) {
        return patientRepository.save(newPatient);
    }

    public List<Patient> getAllPatients() {
        return patientRepository.findAll();
    }

}
