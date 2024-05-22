package com.projet.poo.conseil;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ConseilController {
    private final ConseilService conseilService;

    public ConseilController(ConseilService conseilService) {
        this.conseilService = conseilService;
    }

    @GetMapping("/conseil")
    public List<ConseilModel> getAllConseils() {
        return conseilService.getAllConseils();
    }

    @GetMapping("/conseil/{id}")
    public ConseilModel getConseilById(@PathVariable String id) {
        return conseilService.getConseilById(id);
    }

    @PostMapping("/conseil")
    public String addConseil(@RequestBody ConseilModel conseil) {
        conseilService.addConseil(conseil);
        return "Conseil added";
    }

    @DeleteMapping("/conseil/{id}")
    public String deleteConseil(@PathVariable String id) {
        conseilService.deleteConseil(id);
        return "Conseil deleted";
    }

    @PutMapping("/conseil/{id}")
    public String updateConseil(@PathVariable String id, @RequestBody ConseilModel conseil) {
        conseilService.updateConseil(id, conseil);
        return "Conseil updated";
    }
}
