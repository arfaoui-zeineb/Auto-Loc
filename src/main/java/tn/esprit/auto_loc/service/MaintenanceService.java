package tn.esprit.auto_loc.service;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.esprit.auto_loc.domain.Maintenance;
import tn.esprit.auto_loc.repository.MaintenanceRepository;

import java.util.List;

@Service
@RequiredArgsConstructor
public class MaintenanceService implements IMaintenanceService {


    final MaintenanceRepository maintenanceRepo;

    @Override
    public List<Maintenance> retrieveAllMaintenances() {
        return (List<Maintenance>) maintenanceRepo.findAll();
    }

    @Override
    public Maintenance addMaintenance(Maintenance m) {
        return (Maintenance) maintenanceRepo.save(m);
    }

    @Override
    public Maintenance updateMaintenance(Maintenance m) {
        return (Maintenance) maintenanceRepo.save(m);
    }

    @Override
    public Maintenance retrieveMaintenance(Long idMaintenance) {
        return (Maintenance) maintenanceRepo.findById(idMaintenance).get();
    }

    @Override
    public void removeMaintenance(Long idMaintenance) {
        maintenanceRepo.deleteById(idMaintenance);
    }

    @Override
    public List<Maintenance> addMaintenances(List<Maintenance> maintenances) {
        return (List<Maintenance>) maintenanceRepo.saveAll(maintenances);
    }
}