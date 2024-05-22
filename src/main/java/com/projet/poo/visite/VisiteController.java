package com.projet.poo.visite;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class VisiteController {
    private final VisiteService visiteService;

    public VisiteController(VisiteService visiteService) {
        this.visiteService = visiteService;
    }

    @GetMapping("/visite")
    public List<VisiteModel> getAllVisites() {
        return visiteService.getAllVisites();
    }

    @GetMapping("/visite/{id}")
    public VisiteModel getVisiteById(@PathVariable String id) {
        return visiteService.getVisiteById(id);
    }

    @PostMapping("/visite")
    public String addVisite(@RequestBody VisiteModel visite) {
        visiteService.addVisite(visite);
        return "Visite added";
    }

    @DeleteMapping("/visite/{id}")
    public String deleteVisite(@PathVariable String id) {
        visiteService.deleteVisite(id);
        return "Visite deleted";
    }

    @PutMapping("/visite/{id}")
    public String updateVisite(@PathVariable String id, @RequestBody VisiteModel visite) {
        visiteService.updateVisite(id, visite);
        return "Visite updated";
    }
}
