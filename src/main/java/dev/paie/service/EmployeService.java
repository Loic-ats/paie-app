package dev.paie.service;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import dev.paie.entite.Employe;
import dev.paie.entite.Entreprise;
import dev.paie.entite.Grade;
import dev.paie.entite.ProfilRemuneration;
import dev.paie.repository.EmployeRepository;

@Service
public class EmployeService {

	private EmployeRepository employeRepository;

	public EmployeService(EmployeRepository employeRep) {
		this.employeRepository = employeRep;
	}

	@Transactional
	public Employe creerNouveauEmploye(Entreprise entreprise, ProfilRemuneration profilRemuneration, Grade grade) {
		Employe nouvelleEmploye = new Employe(entreprise, profilRemuneration, grade);
		return employeRepository.save(nouvelleEmploye);

	}

}
