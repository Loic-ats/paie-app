package dev.paie.controller;

import javax.validation.Valid;

import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import dev.paie.service.EmployeService;

public class EmployeController {

	private EmployeService EmployeService;

	public EmployeController(EmployeService EmployeService) {
		this.EmployeService = EmployeService;
	}

	@PostMapping(path = "employe")
	public ResponseEntity<?> creerEmploye(@RequestBody CreerEmployeRequestDto employe,
			BindingResult resultatValidation) {

		if (resultatValidation.hasErrors()) {
			return ResponseEntity.badRequest().body("Le Nom ou le Prénom comporte moins de 3 caractères");
		}

		return ResponseEntity
				.ok(new CreerEmployeReponseDto(EmployeService.creerNouveauEmploye(employe.getEntreprise(), employe.getProfilRemuneration(), employe.getGrade()));
	}

}
