package com.projet.poo.agent;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class AgentController {
    private final AgentService agentService;

    public AgentController(AgentService agentService) {
        this.agentService = agentService;
    }

    @GetMapping("/agent")
    public List<AgentModel> getAllAgents() {
        return agentService.getAllAgents();
    }

    @GetMapping("/agent/{id}")
    public AgentModel getAgentById(@PathVariable String id) {
        return agentService.getAgentById(id);
    }

    @PostMapping("/agent")
    public String addAgent(@RequestBody AgentModel agent) {
        agentService.addAgent(agent);
        return "Agent added";
    }

    @DeleteMapping("/agent/{id}")
    public String deleteAgent(@PathVariable String id) {
        agentService.deleteAgent(id);
        return "Agent deleted";
    }

    @PutMapping("/agent/{id}")
    public String updateAgent(@PathVariable String id, @RequestBody AgentModel agent) {
        agentService.updateAgent(id, agent);
        return "Agent updated";
    }
}
