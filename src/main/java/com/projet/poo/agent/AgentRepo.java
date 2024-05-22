package com.projet.poo.agent;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface AgentRepo extends MongoRepository<AgentModel, Long> {
    AgentModel findById(String id);
    void deleteById(String id);
}
