package com.projet.poo.client;

import com.projet.poo.client.ClientModel;
import com.projet.poo.client.ClientRepo;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClientService {
    private final ClientRepo clientRepo;

    public ClientService(ClientRepo clientRepo) {
        this.clientRepo = clientRepo;
    }

    public List<ClientModel> getAllClients() {
        return clientRepo.findAll();
    }

    public ClientModel getClientById(String id) {
        return clientRepo.findById(id);
    }

    public void addClient(ClientModel client) {
        clientRepo.save(client);
    }

    public void deleteClient(String id) {
        clientRepo.deleteById(id);
    }

    public void updateClient(String id,ClientModel client) {
        ClientModel clientToUpdate = clientRepo.findById(id);

        if (client.getNom() != null) {
            clientToUpdate.setNom(client.getNom());
        } else {
            clientToUpdate.setNom(clientToUpdate.getNom());
        }

        if (client.getPrenom() != null) {
            clientToUpdate.setPrenom(client.getPrenom());
        } else {
            clientToUpdate.setPrenom(clientToUpdate.getPrenom());
        }

        if (client.getEmail() != null) {
            clientToUpdate.setEmail(client.getEmail());
        } else {
            clientToUpdate.setEmail(clientToUpdate.getEmail());
        }

        if (client.getTelephone() != null) {
            clientToUpdate.setTelephone(client.getTelephone());
        } else {
            clientToUpdate.setTelephone(clientToUpdate.getTelephone());
        }

        if (client.getDescriptionRecherche() != null) {
            clientToUpdate.setDescriptionRecherche(client.getDescriptionRecherche());
        } else {
            clientToUpdate.setDescriptionRecherche(clientToUpdate.getDescriptionRecherche());
        }

        if (client.getBudget() != 0) {
            clientToUpdate.setBudget(client.getBudget());
        } else {
            clientToUpdate.setBudget(clientToUpdate.getBudget());
        }
        clientRepo.save(clientToUpdate);
    }
}
