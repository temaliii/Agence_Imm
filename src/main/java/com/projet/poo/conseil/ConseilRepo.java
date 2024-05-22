package com.projet.poo.conseil;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface ConseilRepo extends MongoRepository<ConseilModel, Long> {
    ConseilModel findById(String id);
    void deleteById(String id);
}
