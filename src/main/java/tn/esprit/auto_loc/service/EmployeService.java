package tn.esprit.auto_loc.service;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.esprit.auto_loc.domain.Employe;
import tn.esprit.auto_loc.repository.EmployeRepository;

import java.util.List;

@Service
@RequiredArgsConstructor
public class EmployeService implements IEmployeService {


    final EmployeRepository employeRepo;

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
        return (Employe) employeRepo.findById(idEmploye).orElse(null);
    }

    @Override
    public void removeEmploye(Long idEmploye) {
        employeRepo.deleteById(idEmploye);
    }

    @Override
    public List<Employe> addEmployes(List<Employe> employes) {
        return (List<Employe>) employeRepo.saveAll(employes);
    }
}
