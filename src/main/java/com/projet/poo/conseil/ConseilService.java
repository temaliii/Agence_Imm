package com.projet.poo.conseil;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ConseilService {
    private final ConseilRepo conseilRepo;

    public ConseilService(ConseilRepo conseilRepo) {
        this.conseilRepo = conseilRepo;
    }

    public List<ConseilModel> getAllConseils() {
        return conseilRepo.findAll();
    }

    public ConseilModel getConseilById(String id) {
        return conseilRepo.findById(id);
    }

    public void addConseil(ConseilModel conseil) {
        conseilRepo.save(conseil);
    }

    public void deleteConseil(String id) {
        conseilRepo.deleteById(id);
    }

    public void updateConseil(String id, ConseilModel conseil) {
        ConseilModel conseilToUpdate = conseilRepo.findById(id);

        if (conseil.getIdClient() != null) {
            conseilToUpdate.setIdClient(conseil.getIdClient());
        } else {
            conseilToUpdate.setIdClient(conseilToUpdate.getIdClient());
        }

        if (conseil.getIdPropriete() != null) {
            conseilToUpdate.setIdPropriete(conseil.getIdPropriete());
        } else {
            conseilToUpdate.setIdPropriete(conseilToUpdate.getIdPropriete());
        }

        if (conseil.getConseil() != null) {
            conseilToUpdate.setConseil(conseil.getConseil());
        } else {
            conseilToUpdate.setConseil(conseilToUpdate.getConseil());
        }
        conseilRepo.save(conseilToUpdate);
    }
}
