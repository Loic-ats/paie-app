package dev.paie.controller.entreprise;

public class CreerEntrepriseReponseDto extends CreerEntrepriseRequestDto {

	private String siret;
	private String denomination;

	public CreerEntrepriseReponseDto(String siret, String denomination) {
		super();
		this.siret = siret;
		this.denomination = denomination;
	}

	public String getSiret() {
		return siret;
	}

	public void setSiret(String siret) {
		this.siret = siret;
	}

	public String getDenomination() {
		return denomination;
	}

	public void setDenomination(String denomination) {
		this.denomination = denomination;
	}

}
