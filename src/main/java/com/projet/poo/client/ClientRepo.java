package com.projet.poo.client;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface ClientRepo extends MongoRepository<ClientModel, Long> {
    ClientModel findById(String id);
    void deleteById(String id);
}
