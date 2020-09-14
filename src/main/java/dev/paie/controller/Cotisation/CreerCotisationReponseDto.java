package dev.paie.controller.Cotisation;

import dev.paie.entite.Cotisation;

public class CreerCotisationReponseDto extends CreerCotisationRequestDto {

	private int id;

	public CreerCotisationReponseDto(Cotisation cotisation) {

		this.id = cotisation.getId();
		this.setCode(cotisation.getCode());
		this.setLibelle(cotisation.getLibelle());
		this.setTauxPatronal(cotisation.getTauxPatronal());
		this.setTauxSalarial(cotisation.getTauxSalarial());
		this.setImposable(cotisation.getImposable());
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

}
