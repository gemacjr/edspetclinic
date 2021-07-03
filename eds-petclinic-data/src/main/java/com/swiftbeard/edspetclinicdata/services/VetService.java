package com.swiftbeard.edspetclinicdata.services;

import com.swiftbeard.edspetclinicdata.model.Vet;

import java.util.Set;

public interface VetService {

    Vet findById(Long id);

    Vet save(Vet vet);

    Set<Vet> findAll();
}
