package dev.paie.controller;

import dev.paie.entite.ProfilRemuneration;

public class CreerProfilRemunerationReponseDto extends CreerProfilRemunerationRequestDto {

	private int id;

	public CreerProfilRemunerationReponseDto(ProfilRemuneration profilRemuneration) {

		this.id = profilRemuneration.getId();
		this.setAvantages(profilRemuneration.getAvantages());
		this.setCotisations(profilRemuneration.getCotisations());
		this.setCode(profilRemuneration.getCode());

	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

}
