package dev.paie.controller;

import dev.paie.entite.Grade;

public class CreerGradeResponseDto extends CreerGradeRequestDto {

	private int id;

	public CreerGradeResponseDto(Grade grade) {

		this.id = grade.getId();
		this.setCode(grade.getCode());
		this.setNbHeuresBase(grade.getNbHeuresBase());
		this.setTauxBase(getTauxBase());

	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

}
