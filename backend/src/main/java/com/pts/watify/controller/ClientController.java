package com.pts.watify.controller;

import com.pts.watify.dto.ClientDto;
import com.pts.watify.model.Client;
import com.pts.watify.service.ClientService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
@RequiredArgsConstructor
public class ClientController {

    private final ClientService clientService;

    @GetMapping("/{userId}/clients")
    public List<Client> getClients(@PathVariable Long userId) {
        return clientService.getAll();
    }

    @PostMapping("/{userId}/client")
    public Client createClient(@PathVariable Long userId,
                               @RequestBody ClientDto newClient) {
        return clientService.create(newClient.getName(), newClient.getIc(), newClient.getDic(), newClient.getMdRate());
    }
}
