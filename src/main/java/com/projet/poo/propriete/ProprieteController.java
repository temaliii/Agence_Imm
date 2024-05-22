package com.projet.poo.propriete;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ProprieteController {
    private final ProprieteService proprieteService;

    public ProprieteController(ProprieteService proprieteService) {
        this.proprieteService = proprieteService;
    }

    @GetMapping("/propriete")
    public List<ProprieteModel> getAllProprietes() {
        return proprieteService.getAllProprietes();
    }

    @GetMapping("/propriete/{id}")
    public ProprieteModel getProprieteById(@PathVariable String id) {
        return proprieteService.getProprieteById(id);
    }

    @PostMapping("/propriete")
    public String addPropriete(@RequestBody ProprieteModel propriete) {
        proprieteService.addPropriete(propriete);
        return "Propriete added";
    }

    @DeleteMapping("/propriete/{id}")
    public String deletePropriete(@PathVariable String id) {
        proprieteService.deletePropriete(id);
        return "Propriete deleted";
    }

    @PutMapping("/propriete/{id}")
    public String updatePropriete(@PathVariable String id, @RequestBody ProprieteModel propriete) {
        proprieteService.updatePropriete(id, propriete);
        return "Propriete updated";
    }
}
