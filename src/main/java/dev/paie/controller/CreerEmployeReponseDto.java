package dev.paie.controller;

import dev.paie.entite.Employe;

public class CreerEmployeReponseDto extends CreerEmployeRequestDto {

	private int matricule;

	public CreerEmployeReponseDto(Employe employe) {

		this.matricule = employe.getMatricule();
		this.setEntreprise(employe.getEntrepise());
		this.setProfilRemuneration(employe.getProfilRemuneration());
		this.setGrade(employe.getGrade());
	}

	public int getMatricule() {
		return matricule;
	}

	public void setMatricule(int matricule) {
		this.matricule = matricule;
	}

}
