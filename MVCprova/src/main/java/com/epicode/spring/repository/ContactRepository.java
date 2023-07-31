package com.epicode.spring.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.epicode.spring.model.Contact;

@Repository
public interface ContactRepository extends CrudRepository<Contact, Long>{

}
