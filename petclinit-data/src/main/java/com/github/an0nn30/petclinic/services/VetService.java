package com.github.an0nn30.petclinic.services;

import com.github.an0nn30.petclinic.model.Vet;

import java.util.Set;

public interface VetService {
    Vet findById(Long id);
    Vet save(Vet Vet);
    Set<Vet> findAll();
    Vet findByLastName(String lastName);
}
