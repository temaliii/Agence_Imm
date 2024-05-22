package com.projet.poo.visite;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface VisiteRepo extends MongoRepository<VisiteModel, Long> {
    VisiteModel findById(String id);
    void deleteById(String id);
}
