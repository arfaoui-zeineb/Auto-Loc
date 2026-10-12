package tn.esprit.auto_loc.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.auto_loc.domain.Vehicule;
import tn.esprit.auto_loc.service.IVehiculeService;
import tn.esprit.auto_loc.service.VehiculeService;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/Vehicule")
public class VehiculeController {
    private final IVehiculeService iv;
    @PostMapping("/addVehicule")
    public Vehicule addVehicule(@RequestBody Vehicule v)
    {
        return iv.addVehicule(v);
    }
    @GetMapping("/getVehicules")
    public List<Vehicule> getAllVehicules()
    {
        return iv.retrieveAllVehicules();
    }
    @GetMapping("/getVehiculeId/{idv}")
    public Vehicule getvehiculebyid(@PathVariable long idv)
    {
        return iv.retrieveVehicule(idv);
    }

    @DeleteMapping("/deleteVehicule/{idvv}")
    public void deleteVehicule(@PathVariable long idvv)
    {
        iv.removeVehicule(idvv);
    }

    @PutMapping("/updateVehicule")
    public Vehicule updateVehicule (@RequestBody Vehicule v)
    {
        return iv.updateVehicule(v);
    }



}
