package com.projet.poo.contrat;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ContratService {
    private final ContratRepo contratRepo;

    public ContratService(ContratRepo contratRepo) {
        this.contratRepo = contratRepo;
    }

    public List<ContratModel> getAllContrats() {
        return contratRepo.findAll();
    }

    public ContratModel getContratById(String id) {
        return contratRepo.findById(id);
    }

    public void addContrat(ContratModel contrat) {
        contratRepo.save(contrat);
    }

    public void deleteContrat(String id) {
        contratRepo.deleteById(id);
    }

    public void updateContrat(String id, ContratModel contrat) {
        ContratModel contratToUpdate = contratRepo.findById(id);

        if (contrat.getType() != null) {
            contratToUpdate.setType(contrat.getType());
        } else {
            contratToUpdate.setType(contratToUpdate.getType());
        }

        if (contrat.getIdAgent() != null) {
            contratToUpdate.setIdAgent(contrat.getIdAgent());
        } else {
            contratToUpdate.setIdAgent(contratToUpdate.getIdAgent());
        }

        if (contrat.getIdClient() != null) {
            contratToUpdate.setIdClient(contrat.getIdClient());
        } else {
            contratToUpdate.setIdClient(contratToUpdate.getIdClient());
        }

        if (contrat.getIdPropriete() != null) {
            contratToUpdate.setIdPropriete(contrat.getIdPropriete());
        } else {
            contratToUpdate.setIdPropriete(contratToUpdate.getIdPropriete());
        }

        if (contrat.getFraisAgence() != 0.0) {
            contratToUpdate.setFraisAgence(contrat.getFraisAgence());
        } else {
            contratToUpdate.setFraisAgence(contratToUpdate.getFraisAgence());
        }

        if (contrat.getPrixFinal() != 0) {
            contratToUpdate.setPrixFinal(contrat.getPrixFinal());
        } else {
            contratToUpdate.setPrixFinal(contratToUpdate.getPrixFinal());
        }

        if (contrat.getDescription() != null) {
            contratToUpdate.setDescription(contrat.getDescription());
        } else {
            contratToUpdate.setDescription(contratToUpdate.getDescription());
        }
        contratRepo.save(contratToUpdate);


    }
}
