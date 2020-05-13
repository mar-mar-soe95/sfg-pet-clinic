package com.pet.demo.service;

import java.util.Set;

public interface CrudService<T,ID> {
	
	T findById(Long id);
	
	Set<T> findAll();
	
	T save(T object);
	
	T delete();
	
	T deleteById(Long id);

}
