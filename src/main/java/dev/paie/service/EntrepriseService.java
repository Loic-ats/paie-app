package dev.paie.service;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import dev.paie.entite.Entreprise;
import dev.paie.repository.EntrepriseRepository;

@Service
public class EntrepriseService {

	private EntrepriseRepository entrepriseRepository;

	public EntrepriseService(EntrepriseRepository entrepriseRepository) {
		this.entrepriseRepository = entrepriseRepository;

	}

	@Transactional
	public Entreprise creerNouvelleEntreprise(String siret, String denomination, String adresse, String urssaf,
			String codeNaf) {
		Entreprise nouvelleEntreprise = new Entreprise(siret, denomination, adresse, urssaf, codeNaf);
		return entrepriseRepository.save(nouvelleEntreprise);

	}
}
