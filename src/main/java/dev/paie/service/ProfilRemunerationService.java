package dev.paie.service;

import java.util.List;

import org.springframework.transaction.annotation.Transactional;

import dev.paie.entite.Avantage;
import dev.paie.entite.Cotisation;
import dev.paie.entite.ProfilRemuneration;
import dev.paie.repository.ProfilRemunerationRepository;

public class ProfilRemunerationService {

	private ProfilRemunerationRepository profilRemunerationRepository;

	public ProfilRemunerationService(ProfilRemunerationRepository profilRemunerationRepository) {
		this.profilRemunerationRepository = profilRemunerationRepository;
	}

	@Transactional
	public ProfilRemuneration creerNouveauProfilRemuneration(String code, List<Avantage> avantages,
			List<Cotisation> cotisations) {
		ProfilRemuneration nouveauProfilRemuneration = new ProfilRemuneration(code, avantages, cotisations);
		return profilRemunerationRepository.save(nouveauProfilRemuneration);

	}

}
