package dev.paie.controller.bulletindesalaire;

import java.util.ArrayList;
import java.util.List;

import dev.paie.controller.Cotisation.CreerCotisationReponseDto;
import dev.paie.entite.BulletinSalaire;
import dev.paie.entite.Cotisation;
import dev.paie.service.CotisationService;

public class BulletinSalairePrecisDto extends CreerBulletinSalaireReponseDto {

	private CotisationService cService;
	private List<CreerCotisationReponseDto> listeCotisationsBulletinDto = new ArrayList<>();
	private String dateDebutPeriodeBulletin;
	private String dateFinPeriodeBulletin;
	private String nomEntreprise;
	private String siretEntreprise;

	public BulletinSalairePrecisDto(BulletinSalaire bulletin) {
		super(bulletin);

		// Gestion infos Générales
		this.dateDebutPeriodeBulletin = bulletin.getPeriode().getDateDebut().toString();
		this.dateFinPeriodeBulletin = bulletin.getPeriode().getDateFin().toString();
		this.nomEntreprise = bulletin.getRemunerationEmploye().getEntreprise().getDenomination();
		this.siretEntreprise = bulletin.getRemunerationEmploye().getEntreprise().getSiret();

		// Gestion Cotisations
		List<Cotisation> listeCotisationsBulletin = bulletin.getRemunerationEmploye().getProfilRemuneration()
				.getCotisations();
		for (Cotisation cotisationObj : listeCotisationsBulletin) {
			this.listeCotisationsBulletinDto.add(new CreerCotisationReponseDto(cotisationObj));
		}

	}

	public CotisationService getcService() {
		return cService;
	}

	public void setcService(CotisationService cService) {
		this.cService = cService;
	}

	public List<CreerCotisationReponseDto> getListeCotisationsBulletinDto() {
		return listeCotisationsBulletinDto;
	}

	public void setListeCotisationsBulletinDto(List<CreerCotisationReponseDto> listeCotisationsBulletinDto) {
		this.listeCotisationsBulletinDto = listeCotisationsBulletinDto;
	}

	public String getDateDebutPeriodeBulletin() {
		return dateDebutPeriodeBulletin;
	}

	public void setDateDebutPeriodeBulletin(String dateDebutPeriodeBulletin) {
		this.dateDebutPeriodeBulletin = dateDebutPeriodeBulletin;
	}

	public String getDateFinPeriodeBulletin() {
		return dateFinPeriodeBulletin;
	}

	public void setDateFinPeriodeBulletin(String dateFinPeriodeBulletin) {
		this.dateFinPeriodeBulletin = dateFinPeriodeBulletin;
	}

	public String getNomEntreprise() {
		return nomEntreprise;
	}

	public void setNomEntreprise(String nomEntreprise) {
		this.nomEntreprise = nomEntreprise;
	}

	public String getSiretEntreprise() {
		return siretEntreprise;
	}

	public void setSiretEntreprise(String siretEntreprise) {
		this.siretEntreprise = siretEntreprise;
	}

}
