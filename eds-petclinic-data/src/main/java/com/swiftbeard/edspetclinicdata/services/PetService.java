package com.swiftbeard.edspetclinicdata.services;

import com.swiftbeard.edspetclinicdata.model.Pet;

import java.util.Set;

public interface PetService {

    Pet findById(Long id);

    Pet save(Pet pet);

    Set<Pet> findAll();
}