package dev.paie.service;

import java.util.ArrayList;
import java.util.List;

import dev.paie.controller.profilRemuneration.CreerProfilRemunerationReponseDto;
import dev.paie.controller.profilRemuneration.CreerProfilRemunerationRequestDto;
import dev.paie.entite.ProfilRemuneration;
import dev.paie.repository.ProfilRemunerationRepository;

public class ProfilRemunerationService {

	private ProfilRemunerationRepository profilRemunerationRepository;

	public ProfilRemunerationService(ProfilRemunerationRepository profilRemunerationRepository) {
		this.profilRemunerationRepository = profilRemunerationRepository;
	}

	public List<CreerProfilRemunerationRequestDto> listerProfils() {

		List<CreerProfilRemunerationRequestDto> listDto = new ArrayList();

		List<ProfilRemuneration> listProfils = profilRemunerationRepository.findAll();

		for (ProfilRemuneration profil : listProfils) {
			listDto.add(new CreerProfilRemunerationReponseDto(profil));
		}
		return listDto;
	}

}
