package tn.esprit.auto_loc.service;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import tn.esprit.auto_loc.domain.Agence;
import tn.esprit.auto_loc.domain.Employe;
import tn.esprit.auto_loc.repository.AgenceRepository;
import tn.esprit.auto_loc.repository.EmployeRepository;

import java.util.List;

@Service
@RequiredArgsConstructor
public class EmployeService implements IEmployeService {


    final EmployeRepository employeRepo;
    final AgenceRepository agenceRepo;

    @Override
    public List<Employe> retrieveAllEmployes() {
        return (List<Employe>) employeRepo.findAll();
    }

    @Override
    public Employe addEmploye(Employe e) {
        return (Employe) employeRepo.save(e);
    }

    @Override
    public Employe updateEmploye(Employe e) {
        return (Employe) employeRepo.save(e);
    }

    @Override
    public Employe retrieveEmploye(Long idEmploye) {
        return (Employe) employeRepo.findById(idEmploye).get();
    }

    @Override
    public void removeEmploye(Long idEmploye) {
        employeRepo.deleteById(idEmploye);
    }

    @Override
    public List<Employe> addEmployes(List<Employe> employes) {
        return (List<Employe>) employeRepo.saveAll(employes);
    }

    @Override
    @Transactional
    public Employe desaffecterEmploye(Long idEmploye) {
        Employe employe = employeRepo.findById(idEmploye).get();
        employe.setAgence(null);
        return employeRepo.save(employe);
    }

    @Override
    @Transactional
    public Employe affecterEmploye(Long idEmploye, Long idAgence) {
        Employe employe = employeRepo.findById(idEmploye).get();
        Agence agence = agenceRepo.findById(idAgence).get();
        employe.setAgence(agence);
        return employeRepo.save(employe);
    }
}
