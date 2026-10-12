package tn.esprit.auto_loc.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.auto_loc.domain.Agence;
import tn.esprit.auto_loc.service.AgenceService;
import tn.esprit.auto_loc.service.IAgenceService;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/Agence")
public class AgenceController {
    private final IAgenceService ia;
    @PostMapping("/addAgence")
    public Agence addAgence(@RequestBody Agence a)
    {
        return ia.addAgence(a);
    }
    @GetMapping("/getAgences")
    public List<Agence> getAllAgences()
    {
        return ia.retrieveAllAgences();
    }
    @GetMapping("/getAgenceId/{idA}")
    public Agence getAgencebyid(@PathVariable long idA)
    {
        return ia.retrieveAgence(idA);
    }

    @DeleteMapping("/deleteAgence/{idAA}")
    public void deleteAgence(@PathVariable long idAA)
    {
        ia.removeAgence(idAA);
    }

    @PutMapping("/updateAgence")
    public Agence updateAgence (@RequestBody Agence a)
    {
        return ia.updateAgence(a);
    }



}
