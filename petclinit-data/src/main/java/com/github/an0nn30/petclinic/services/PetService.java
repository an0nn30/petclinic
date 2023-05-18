package com.github.an0nn30.petclinic.services;

import com.github.an0nn30.petclinic.model.Pet;

import java.util.Set;

public interface PetService {
    Pet findById(Long id);
    Pet save(Pet Pet);
    Set<Pet> findAll();
    Pet findByLastName(String lastName);
}
