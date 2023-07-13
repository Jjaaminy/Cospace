package com.example.cospace.service;

import com.example.cospace.Model.Mitglied;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MitgliederRepo extends CrudRepository<Mitglied,Integer> {
}
