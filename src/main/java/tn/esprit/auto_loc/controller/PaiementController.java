package tn.esprit.auto_loc.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.auto_loc.domain.Paiement;
import tn.esprit.auto_loc.service.IPaiementService;
import tn.esprit.auto_loc.service.PaiementService;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/Paiement")
public class PaiementController {
    private final IPaiementService ip;
    @PostMapping("/addPaiement")
    public Paiement addPaiement(@RequestBody Paiement p)
    {
        return ip.addPaiement(p);
    }
    @GetMapping("/getPaiements")
    public List<Paiement> getAllPaiements()
    {
        return ip.retrieveAllPaiements();
    }
    @GetMapping("/getPaiementId/{idp}")
    public Paiement getpaiementbyid(@PathVariable long idp)
    {
        return ip.retrievePaiement(idp);
    }

    @DeleteMapping("/deletePaiement/{idpp}")
    public void deletePaiement(@PathVariable long idpp)
    {
        ip.removePaiement(idpp);
    }

    @PutMapping("/updatePaiement")
    public Paiement updatePaiement (@RequestBody Paiement p)
    {
        return ip.updatePaiement(p);
    }



}
