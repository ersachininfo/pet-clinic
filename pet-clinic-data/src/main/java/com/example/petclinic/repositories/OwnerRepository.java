package com.example.petclinic.repositories;

import com.example.petclinic.model.Owner;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by jt on 8/5/18.
 */
public interface OwnerRepository extends CrudRepository<Owner, Long> {

    Owner findByLastName(String lastName);
}
