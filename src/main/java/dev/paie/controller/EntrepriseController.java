package dev.paie.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import dev.paie.service.EntrepriseService;

public class EntrepriseController {

	private EntrepriseService entrepriseService;

	public EntrepriseController(EntrepriseService EntrepriseService) {
		this.entrepriseService = EntrepriseService;
	}

	@PostMapping(path = "entreprise")
	public ResponseEntity<?> creerEntreprise(@RequestBody CreerEntrepriseRequestDto entreprise) {

		return ResponseEntity.ok(new CreerEntrepriseReponseDto(
				entrepriseService.creerNouvelleEntreprise(entreprise.getSiret(), entreprise.getDenomination(),
						entreprise.getAdresse(), entreprise.getUrssaf(), entreprise.getCodeNaf())));
	}

}
