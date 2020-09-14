package dev.paie.controller.grade;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import dev.paie.service.GradeService;

@RestController
@RequestMapping("grades")
public class GradeController {

	private GradeService gradeService;

	public GradeController(GradeService gradeService) {
		this.gradeService = gradeService;
	}

	@GetMapping
	public ResponseEntity<?> getAllGrades() {
		return ResponseEntity.status(HttpStatus.OK).body(gradeService.listerGrades());
	}
}
