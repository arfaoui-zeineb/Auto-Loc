package tn.esprit.auto_loc.service;

import tn.esprit.auto_loc.domain.Employe;

import java.util.List;

public interface IEmployeService {

    List<Employe> retrieveAllEmployes();

    Employe addEmploye(Employe e);

    Employe updateEmploye(Employe e);

    Employe retrieveEmploye(Long idEmploye);

    void removeEmploye(Long idEmploye);

    List<Employe> addEmployes(List<Employe> employes);

    Employe desaffecterEmploye(Long idEmploye);

    Employe affecterEmploye(Long idEmploye, Long idAgence);
}
