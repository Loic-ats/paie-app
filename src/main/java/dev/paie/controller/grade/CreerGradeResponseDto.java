package dev.paie.controller.grade;

import java.math.BigDecimal;

public class CreerGradeResponseDto {

	private String libelle;

	private BigDecimal salaireAnnuel;

	public CreerGradeResponseDto(String libelle, BigDecimal salaireAnnuel) {
		super();
		this.libelle = libelle;
		this.salaireAnnuel = salaireAnnuel;
	}

	public String getLibelle() {
		return libelle;
	}

	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}

	public BigDecimal getSalaireAnnuel() {
		return salaireAnnuel;
	}

	public void setSalaireAnnuel(BigDecimal salaireAnnuel) {
		this.salaireAnnuel = salaireAnnuel;
	}

}
