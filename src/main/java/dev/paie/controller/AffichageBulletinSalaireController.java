package dev.paie.controller;

import dev.paie.service.AffichageListeBulletinSalaireService;

public class AffichageBulletinSalaireController {

	private AffichageListeBulletinSalaireService affichageListeBulletinSalaireService;

	public AffichageBulletinSalaireController(
			AffichageListeBulletinSalaireService affichageListeBulletinSalaireService) {
		this.affichageListeBulletinSalaireService = affichageListeBulletinSalaireService;
	}

	/*
	 * @PostMapping(path = "BulletinSalaire") public ResponseEntity<?>
	 * creerListBulletinSalaire(
	 * 
	 * @RequestBody CreerAffichageListeBulletinSalaireRequestDto BulletinSalaire) {
	 * 
	 * return ResponseEntity.ok(new CreerAffichageListeBulletinSalaireReponseDto(
	 * affichageListeBulletinSalaireService.creerNouveauBulletinSalaire(
	 * BulletinSalaire.getBulletinSalaire(), BulletinSalaire.getPeriode(),
	 * BulletinSalaire.getPrimeExceptionnel()))); }
	 */

}
