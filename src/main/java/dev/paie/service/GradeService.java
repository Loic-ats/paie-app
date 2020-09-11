package dev.paie.service;

import java.math.BigDecimal;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import dev.paie.entite.Grade;
import dev.paie.repository.GradeRepository;

@Service
public class GradeService {

	private GradeRepository gradeRepository;

	public GradeService(GradeRepository gradeRepository) {
		this.gradeRepository = gradeRepository;

	}

	@Transactional
	public Grade creerNouveauGrade(String code, BigDecimal nbHeuresBase, BigDecimal tauxBase) {
		Grade nouveauGrade = new Grade(code, nbHeuresBase, tauxBase);
		return gradeRepository.save(nouveauGrade);

	}

}
