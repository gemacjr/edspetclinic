package com.swiftbeard.edspetclinic.bootstrap;

import com.swiftbeard.edspetclinic.model.Owner;
import com.swiftbeard.edspetclinic.model.Vet;
import com.swiftbeard.edspetclinic.services.OwnerService;
import com.swiftbeard.edspetclinic.services.VetService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;


@Component
public class DataLoader implements CommandLineRunner {

    private final OwnerService ownerService;
    private final VetService vetService;

    public DataLoader(OwnerService ownerService, VetService vetService) {
        this.ownerService = ownerService;
        this.vetService = vetService;
    }

    @Override
    public void run(String... args) throws Exception {

        Owner owner1 = new Owner();
        owner1.setId(1L);
        owner1.setFirstName("Mike");
        owner1.setLastName("Weston");

        ownerService.save(owner1);

        Owner owner2 = new Owner();
        owner2.setId(2L);
        owner2.setFirstName("June");
        owner2.setLastName("Beston");

        ownerService.save(owner2);

        System.out.println("Loaded Owners....");

        Vet vet1 = new Vet();
        vet1.setId(1L);
        vet1.setFirstName("Jill");
        vet1.setLastName("Milson");

        vetService.save(vet1);

        Vet vet2 = new Vet();
        vet2.setId(2L);
        vet2.setFirstName("John");
        vet2.setLastName("Smith");

        vetService.save(vet2);

        System.out.println("Loaded Vets...");




    }
}
