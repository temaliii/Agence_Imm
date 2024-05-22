package com.projet.poo.propriete;

import com.projet.poo.propriete.ProprieteModel;
import com.projet.poo.propriete.ProprieteRepo;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProprieteService {
    private final ProprieteRepo proprieteRepo;

    public ProprieteService(ProprieteRepo proprieteRepo) {
        this.proprieteRepo = proprieteRepo;
    }

    public List<ProprieteModel> getAllProprietes() {
        return proprieteRepo.findAll();
    }

    public ProprieteModel getProprieteById(String id) {
        return proprieteRepo.findById(id);
    }

    public void addPropriete(ProprieteModel propriete) {
        proprieteRepo.save(propriete);
    }

    public void deletePropriete(String id) {
        proprieteRepo.deleteById(id);
    }

    public void updatePropriete(String id,ProprieteModel propriete) {
        ProprieteModel proprieteToUpdate = proprieteRepo.findById(id);

        if (propriete.getPrix() != 0) {
            proprieteToUpdate.setPrix(propriete.getPrix());
        } else {
            proprieteToUpdate.setPrix(proprieteToUpdate.getPrix());
        }

        if (propriete.getAdresse() != null) {
            proprieteToUpdate.setAdresse(propriete.getAdresse());
        } else {
            proprieteToUpdate.setAdresse(proprieteToUpdate.getAdresse());
        }

        if (propriete.getSuperficie() != 0.0) {
            proprieteToUpdate.setSuperficie(propriete.getSuperficie());
        } else {
            proprieteToUpdate.setSuperficie(proprieteToUpdate.getSuperficie());
        }

        if (propriete.getNbChambres() != 0) {
            proprieteToUpdate.setNbChambres(propriete.getNbChambres());
        } else {
            proprieteToUpdate.setNbChambres(proprieteToUpdate.getNbChambres());
        }

        if (propriete.getNomProprietaire() != null) {
            proprieteToUpdate.setNomProprietaire(propriete.getNomProprietaire());
        } else {
            proprieteToUpdate.setNomProprietaire(proprieteToUpdate.getNomProprietaire());
        }

        if (propriete.getPrenomProprietaire() != null) {
            proprieteToUpdate.setPrenomProprietaire(propriete.getPrenomProprietaire());
        } else {
            proprieteToUpdate.setPrenomProprietaire(proprieteToUpdate.getPrenomProprietaire());
        }

        if (propriete.getTelephone() != null) {
            proprieteToUpdate.setTelephone(propriete.getTelephone());
        } else {
            proprieteToUpdate.setTelephone(proprieteToUpdate.getTelephone());
        }

        if (propriete.getEmail() != null) {
            proprieteToUpdate.setEmail(propriete.getEmail());
        } else {
            proprieteToUpdate.setEmail(proprieteToUpdate.getEmail());
        }

        if (propriete.getDescription() != null) {
            proprieteToUpdate.setDescription(propriete.getDescription());
        } else {
            proprieteToUpdate.setDescription(proprieteToUpdate.getDescription());
        }
        proprieteRepo.save(proprieteToUpdate);
    }
}
