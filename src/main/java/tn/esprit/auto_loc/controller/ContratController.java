package tn.esprit.auto_loc.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.auto_loc.domain.Contrat;
import tn.esprit.auto_loc.service.ContratService;
import tn.esprit.auto_loc.service.IContratService;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/Contrat")
public class  ContratController {
    private final IContratService ic;
    @PostMapping("/addContrat")
    public Contrat addContrat(@RequestBody Contrat c)
    {
        return ic.addContrat(c);
    }
    @GetMapping("/getContrats")
    public List<Contrat> getAllContrats()
    {
        return ic.retrieveAllContrats();
    }
    @GetMapping("/getContratId/{idc}")
    public Contrat getcontratbyid(@PathVariable long idc)
    {
        return ic.retrieveContrat(idc);
    }

    @DeleteMapping("/deleteContrat/{idcc}")
    public void deleteContrat(@PathVariable long idcc)
    {
        ic.removeContrat(idcc);
    }

    @PutMapping("/updateContrat")
    public Contrat updateContrat (@RequestBody Contrat c)
    {
        return ic.updateContrat(c);
    }



}
