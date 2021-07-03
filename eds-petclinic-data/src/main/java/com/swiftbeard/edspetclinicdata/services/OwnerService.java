package com.swiftbeard.edspetclinicdata.services;

import com.swiftbeard.edspetclinicdata.model.Owner;


public interface OwnerService extends CrudService<Owner, Long>{

    Owner findBylastName(String lastName);
}
