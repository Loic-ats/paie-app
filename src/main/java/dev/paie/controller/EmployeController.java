package dev.paie.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import dev.paie.service.EmployeService;

public class EmployeController {

	private EmployeService EmployeService;

	public EmployeController(EmployeService EmployeService) {
		this.EmployeService = EmployeService;
	}

	@PostMapping(path = "employe")
	public ResponseEntity<?> creerEmploye(@RequestBody CreerEmployeRequestDto employe) {

		return ResponseEntity.ok(new CreerEmployeReponseDto(EmployeService.creerNouveauEmploye(employe.getEntreprise(),
				employe.getProfilRemuneration(), employe.getGrade())));
	}

}
