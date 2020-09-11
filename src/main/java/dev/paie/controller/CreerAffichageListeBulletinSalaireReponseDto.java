package dev.paie.controller;

import dev.paie.entite.AffichageListeBulletinSalaire;

public class CreerAffichageListeBulletinSalaireReponseDto extends CreerAffichageListeBulletinSalaireRequestDto {

	private int id;

	public CreerAffichageListeBulletinSalaireReponseDto(AffichageListeBulletinSalaire affichageListeBulletinSalaire) {

		this.id = affichageListeBulletinSalaire.getId();
		this.setBulletinSalaire(affichageListeBulletinSalaire.getBulletinSalaire());
		this.setNetAPayer(affichageListeBulletinSalaire.getNetAPayer());
		this.setNetImposable(affichageListeBulletinSalaire.getNetImposable());
		this.setPeriode(affichageListeBulletinSalaire.getPeriode());
		this.setSalaireBrut(affichageListeBulletinSalaire.getSalaireBrut());
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

}
