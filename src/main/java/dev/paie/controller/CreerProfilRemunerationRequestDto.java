package dev.paie.controller;

import java.util.List;

import dev.paie.entite.Avantage;
import dev.paie.entite.Cotisation;

public class CreerProfilRemunerationRequestDto {

	private String code;
	private List<Avantage> avantages;
	private List<Cotisation> cotisations;

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public List<Avantage> getAvantages() {
		return avantages;
	}

	public void setAvantages(List<Avantage> avantages) {
		this.avantages = avantages;
	}

	public List<Cotisation> getCotisations() {
		return cotisations;
	}

	public void setCotisations(List<Cotisation> cotisations) {
		this.cotisations = cotisations;
	}

}
