package com.projet.poo.propriete;

import com.fasterxml.jackson.databind.annotation.JsonAppend;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ProprieteRepo extends MongoRepository<ProprieteModel, Long> {
    ProprieteModel findById(String id);
    void deleteById(String id);
}
