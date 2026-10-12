package tn.esprit.auto_loc.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.auto_loc.domain.Equipement;
import tn.esprit.auto_loc.service.EquipementService;
import tn.esprit.auto_loc.service.IEquipementService;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/Equipement")
public class EquipementController {
    private final IEquipementService ie;
    @PostMapping("/addEquipement")
    public Equipement addEquipement(@RequestBody Equipement e)
    {
        return ie.addEquipement(e);
    }
    @GetMapping("/getEquipements")
    public List<Equipement> getAllEquipements()
    {
        return ie.retrieveAllEquipements();
    }
    @GetMapping("/getEquipementId/{ide}")
    public Equipement getequipementbyid(@PathVariable long ide)
    {
        return ie.retrieveEquipement(ide);
    }

    @DeleteMapping("/deleteEquipement/{idee}")
    public void deleteEquipement(@PathVariable long idee)
    {
        ie.removeEquipement(idee);
    }

    @PutMapping("/updateEquipement")
    public Equipement updateEquipement (@RequestBody Equipement e)
    {
        return ie.updateEquipement(e);
    }



}
