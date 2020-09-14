package dev.paie.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import dev.paie.controller.bulletindesalaire.BulletinSalairePrecisDto;
import dev.paie.controller.bulletindesalaire.CreerBulletinSalaireReponseDto;
import dev.paie.entite.BulletinSalaire;
import dev.paie.exception.ErreurDonnee;
import dev.paie.repository.BulletinSalaireRepository;

@Service
public class BulletinSalaireService {

	private BulletinSalaireRepository BulletinSalaireRepository;

	public BulletinSalaireService(BulletinSalaireRepository BulletinSalaireRepository) {
		this.BulletinSalaireRepository = BulletinSalaireRepository;
	}

	public List<CreerBulletinSalaireReponseDto> listerBulletins() {

		List<CreerBulletinSalaireReponseDto> listeDto = new ArrayList<>();

		List<BulletinSalaire> listeB = BulletinSalaireRepository.findAll();

		for (BulletinSalaire b : listeB) {
			listeDto.add(new CreerBulletinSalaireReponseDto(b));
		}
		return listeDto;
	}

	public BulletinSalairePrecisDto getBulletin(int idBulletin) {

		BulletinSalairePrecisDto dto;

		Optional<BulletinSalaire> bulletinCherche = BulletinSalaireRepository.findById(idBulletin);

		if (bulletinCherche.isPresent()) {
			dto = new BulletinSalairePrecisDto(bulletinCherche.get());
		} else {
			throw new ErreurDonnee("L'ID renseigné ne correspond à aucun Bulletin enregistré en BDD");
		}

		return dto;
	}
}
