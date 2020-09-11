package dev.paie.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import dev.paie.service.ProfilRemunerationService;

public class ProfilRemunerationController {

	private ProfilRemunerationService profilRemunerationService;

	public ProfilRemunerationController(ProfilRemunerationService profilRemunerationService) {
		this.profilRemunerationService = profilRemunerationService;
	}

	@PostMapping(path = "entreprise")
	public ResponseEntity<?> creerProfilRemuneration(
			@RequestBody CreerProfilRemunerationRequestDto profilRemuneration) {

		return ResponseEntity.ok(new CreerProfilRemunerationReponseDto(
				profilRemunerationService.creerNouveauProfilRemuneration(profilRemuneration.getCode(),
						profilRemuneration.getAvantages(), profilRemuneration.getCotisations())));
	}

}
