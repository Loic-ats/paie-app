package dev.paie.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import dev.paie.service.GradeService;

public class GradeController {

	private GradeService gradeService;

	public GradeController(GradeService gradeService) {
		this.gradeService = gradeService;
	}

	@PostMapping(path = "grade")
	public ResponseEntity<?> creerGrade(@RequestBody CreerGradeRequestDto grade) {

		return ResponseEntity.ok(new CreerGradeResponseDto(
				gradeService.creerNouveauGrade(grade.getCode(), grade.getNbHeuresBase(), grade.getTauxBase())));
	}

}
