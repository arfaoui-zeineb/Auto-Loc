package tn.esprit.auto_loc.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.auto_loc.domain.Maintenance;
import tn.esprit.auto_loc.service.IMaintenanceService;
import tn.esprit.auto_loc.service.MaintenanceService;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/Maintenance")
public class MaintenanceController {
    private final IMaintenanceService im;
    @PostMapping("/addMaintenance")
    public Maintenance addMaintenance(@RequestBody Maintenance m)
    {
        return im.addMaintenance(m);
    }
    @GetMapping("/getMaintenances")
    public List<Maintenance> getAllMaintenances()
    {
        return im.retrieveAllMaintenances();
    }
    @GetMapping("/getMaintenanceId/{idm}")
    public Maintenance getmaintenancebyid(@PathVariable long idm)
    {
        return im.retrieveMaintenance(idm);
    }

    @DeleteMapping("/deleteMaintenance/{idmm}")
    public void deleteMaintenance(@PathVariable long idmm)
    {
        im.removeMaintenance(idmm);
    }

    @PutMapping("/updateMaintenance")
    public Maintenance updateMaintenance (@RequestBody Maintenance m)
    {
        return im.updateMaintenance(m);
    }



}
