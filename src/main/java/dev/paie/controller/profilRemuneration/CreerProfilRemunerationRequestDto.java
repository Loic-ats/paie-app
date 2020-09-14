package dev.paie.controller.profilRemuneration;

import java.util.List;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

public class CreerProfilRemunerationRequestDto {

	@NotNull
	private String code;

	@NotEmpty
	private List<Integer> idCotisations;

	@NotEmpty
	private List<Integer> idAvantages;

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public List<Integer> getIdCotisations() {
		return idCotisations;
	}

	public void setIdCotisations(List<Integer> idCotisations) {
		this.idCotisations = idCotisations;
	}

	public List<Integer> getIdAvantages() {
		return idAvantages;
	}

	public void setIdAvantages(List<Integer> idAvantages) {
		this.idAvantages = idAvantages;
	}

}
