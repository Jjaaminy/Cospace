package com.example.cospace.service;

import com.example.cospace.Model.Buchung;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BuchungRepo extends CrudRepository<Buchung,Integer> {
}
