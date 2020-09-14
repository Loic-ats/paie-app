package dev.paie.service;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import dev.paie.controller.grade.CreerGradeResponseDto;
import dev.paie.entite.Grade;
import dev.paie.repository.GradeRepository;

@Service
public class GradeService {

	private static final String NB_MOIS_ANNEE = "12";

	private GradeRepository gradeRepository;

	public GradeService(GradeRepository gradeRepository) {
		this.gradeRepository = gradeRepository;

	}

	public List<CreerGradeResponseDto> listerGrades() {

		List<CreerGradeResponseDto> listeGradeReponseDto = new ArrayList<>();

		List<Grade> listeGrade = gradeRepository.findAll();

		for (Grade grade : listeGrade) {
			BigDecimal salaireAnnuel = grade.getNbHeuresBase().multiply(grade.getTauxBase())
					.multiply(new BigDecimal(NB_MOIS_ANNEE));
			listeGradeReponseDto.add(new CreerGradeResponseDto(grade.getCode(), salaireAnnuel));
		}
		return listeGradeReponseDto;
	}

}
