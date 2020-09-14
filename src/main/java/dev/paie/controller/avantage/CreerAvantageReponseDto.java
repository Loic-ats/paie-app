package dev.paie.controller.avantage;

import dev.paie.entite.Avantage;

public class CreerAvantageReponseDto extends CreerAvantageRequestDto {

	private int id;

	public CreerAvantageReponseDto(Avantage avantage) {

		this.id = avantage.getId();
		this.setCode(avantage.getCode());
		this.setNom(avantage.getNom());
		this.setMontant(avantage.getMontant());
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
}
