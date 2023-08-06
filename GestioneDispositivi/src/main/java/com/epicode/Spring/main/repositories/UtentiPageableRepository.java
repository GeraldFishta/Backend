package com.epicode.Spring.main.repositories;

import org.springframework.data.repository.PagingAndSortingRepository;


import com.epicode.Spring.main.models.Utente;

public interface UtentiPageableRepository extends PagingAndSortingRepository<Utente, String> {

}
