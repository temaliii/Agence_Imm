package com.projet.poo.visite;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VisiteService {
    private final VisiteRepo visiteRepo;

    public VisiteService(VisiteRepo visiteRepo) {
        this.visiteRepo = visiteRepo;
    }

    public List<VisiteModel> getAllVisites() {
        return visiteRepo.findAll();
    }

    public VisiteModel getVisiteById(String id) {
        return visiteRepo.findById(id);
    }

    public void addVisite(VisiteModel visite) {
        visiteRepo.save(visite);
    }

    public void deleteVisite(String id) {
        visiteRepo.deleteById(id);
    }

    public void updateVisite(String id, VisiteModel visite) {
        VisiteModel visiteToUpdate = visiteRepo.findById(id);

        if (visite.getDate() != null) {
            visiteToUpdate.setDate(visite.getDate());
        } else {
            visiteToUpdate.setDate(visiteToUpdate.getDate());
        }

        if (visite.getIdConseil() != null) {
            visiteToUpdate.setIdConseil(visite.getIdConseil());
        } else {
            visiteToUpdate.setIdConseil(visiteToUpdate.getIdConseil());
        }
        visiteRepo.save(visiteToUpdate);
    }
}
