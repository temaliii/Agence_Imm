package com.projet.poo.contrat;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ContratController {
    private final ContratService contratService;

    public ContratController(ContratService contratService) {
        this.contratService = contratService;
    }

    @GetMapping("/contrat")
    public List<ContratModel> getAllContrats() {
        return contratService.getAllContrats();
    }

    @GetMapping("/contrat/{id}")
    public ContratModel getContratById(@PathVariable String id) {
        return contratService.getContratById(id);
    }

    @PostMapping("/contrat")
    public String addContrat(@RequestBody ContratModel contrat) {
        contratService.addContrat(contrat);
        return "Contrat added";
    }

    @DeleteMapping("/contrat/{id}")
    public String deleteContrat(@PathVariable String id) {
        contratService.deleteContrat(id);
        return "Contrat deleted";
    }

    @PutMapping("/contrat/{id}")
    public String updateContrat(@PathVariable String id, @RequestBody ContratModel contrat) {
        contratService.updateContrat(id, contrat);
        return "Contrat updated";
    }
}
