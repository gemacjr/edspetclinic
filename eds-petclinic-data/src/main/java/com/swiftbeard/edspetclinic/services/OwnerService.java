package com.swiftbeard.edspetclinic.services;

import com.swiftbeard.edspetclinic.model.Owner;


public interface OwnerService extends CrudService<Owner, Long>{

    Owner findBylastName(String lastName);
}
