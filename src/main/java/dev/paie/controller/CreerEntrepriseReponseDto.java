package dev.paie.controller;

import dev.paie.entite.Entreprise;

public class CreerEntrepriseReponseDto extends CreerEntrepriseRequestDto {

	private int id;

	public CreerEntrepriseReponseDto(Entreprise entreprise) {

		this.id = entreprise.getId();
		this.setSiret(entreprise.getSiret());
		this.setDenomination(entreprise.getDenomination());
		this.setAdresse(entreprise.getAdresse());
		this.setUrssaf(entreprise.getUrssaf());
		this.setCodeNaf(entreprise.getCodeNaf());
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

}
