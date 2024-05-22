package com.projet.poo.contrat;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface ContratRepo extends MongoRepository<ContratModel, Long> {
    ContratModel findById(String id);
    void deleteById(String id);
}
