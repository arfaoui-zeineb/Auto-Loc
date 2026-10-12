
package tn.esprit.auto_loc.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.auto_loc.domain.Client;
import tn.esprit.auto_loc.service.ClientService;
import tn.esprit.auto_loc.service.IClientService;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/Client")
public class ClientController {
    private final IClientService ic;
    @PostMapping("/addClient")
    public Client addClient(@RequestBody Client c)
    {

        return ic.addClient(c);
    }
    @GetMapping("/getClients")
    public List<Client> getAllClients()
    {
        return ic.retrieveAllClients();
    }
    @GetMapping("/getClientId/{idc}")
        public Client getclientbyid(@PathVariable long idc)
        {
            return ic.retrieveClient(idc);
        }

    @DeleteMapping("/deleteClient/{idcc}")
        public void deleteClient(@PathVariable long idcc)
    {
        ic.removeClient(idcc);
    }

    @PutMapping("/updateClient")
    public Client updateClient (@RequestBody Client c)
    {
        return ic.updateClient(c);
    }



}
