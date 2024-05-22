package com.projet.poo.agent;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AgentService {
    private final AgentRepo agentRepo;

    public AgentService(AgentRepo agentRepo) {
        this.agentRepo = agentRepo;
    }

    public List<AgentModel> getAllAgents() {
        return agentRepo.findAll();
    }

    public AgentModel getAgentById(String id) {
        return agentRepo.findById(id);
    }

    public void addAgent(AgentModel agent) {
        agentRepo.save(agent);
    }

    public void deleteAgent(String id) {
        agentRepo.deleteById(id);
    }

    public void updateAgent(String id, AgentModel agent) {
        AgentModel agentToUpdate = agentRepo.findById(id);

        agentToUpdate.setNom(agent.getNom() == null ? agentToUpdate.getNom() : agent.getNom());
        agentToUpdate.setPrenom(agent.getPrenom() == null ? agentToUpdate.getPrenom() : agent.getPrenom());
        agentToUpdate.setEmail(agent.getEmail() == null ? agentToUpdate.getEmail() : agent.getEmail());
        agentToUpdate.setTelephone(agent.getTelephone() == null ? agentToUpdate.getTelephone() : agent.getTelephone());
        agentRepo.save(agentToUpdate);
    }
}
