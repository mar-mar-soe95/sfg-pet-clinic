package com.pet.demo.service;

import com.pet.demo.model.Owner;

public interface OwnerService extends CrudService<Owner, Long>{
	
  Owner findBylastName(String lastName);

}
