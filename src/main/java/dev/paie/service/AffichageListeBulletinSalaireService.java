package dev.paie.service;

import java.math.BigDecimal;

import org.springframework.transaction.annotation.Transactional;

import dev.paie.entite.BulletinSalaire;
import dev.paie.entite.Periode;
import dev.paie.entite.RemunerationEmploye;
import dev.paie.repository.BulletinSalaireRepository;

public class AffichageListeBulletinSalaireService {

	private BulletinSalaireRepository bulletinSalaireRepository;

	public AffichageListeBulletinSalaireService(BulletinSalaireRepository bulletinSalaireRepository) {
		this.bulletinSalaireRepository = bulletinSalaireRepository;
	}

	@Transactional
	public BulletinSalaire creerNouveauBulletinSalaire(RemunerationEmploye remunerationEmploye, Periode periode,
			BigDecimal primeExceptionnelle) {
		BulletinSalaire nouveauBulletinSalaire = new BulletinSalaire(remunerationEmploye, periode, primeExceptionnelle);
		return bulletinSalaireRepository.save(nouveauBulletinSalaire);
	}

}
