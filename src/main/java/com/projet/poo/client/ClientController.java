package com.projet.poo.client;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ClientController {
    private final ClientService clientService;

    public ClientController(ClientService clientService) {
        this.clientService = clientService;
    }

    @GetMapping("/client")
    public List<ClientModel> getAllClients() {
        return clientService.getAllClients();
    }

    @GetMapping("/client/{id}")
    public ClientModel getClientById(@PathVariable String id) {
        return clientService.getClientById(id);
    }

    @PostMapping("/client")
    public String addClient(@RequestBody ClientModel client) {
        clientService.addClient(client);
        return "Client added";
    }

    @DeleteMapping("/client/{id}")
    public String deleteClient(@PathVariable String id) {
        clientService.deleteClient(id);
        return "Client deleted";
    }

    @PutMapping("/client/{id}")
    public String updateClient(@PathVariable String id, @RequestBody ClientModel client) {
        clientService.updateClient(id, client);
        return "Client updated";
    }
}
