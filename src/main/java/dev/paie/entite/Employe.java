package dev.paie.entite;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Employe {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int matricule;

	@OneToOne
	private Entreprise entrepise;

	@OneToOne
	private ProfilRemuneration profilRemuneration;

	@OneToOne
	private Grade grade;

	public Employe(Entreprise entrepise, ProfilRemuneration profilRemuneration, Grade grade) {
		super();

		this.entrepise = entrepise;
		this.profilRemuneration = profilRemuneration;
		this.grade = grade;
	}

	public Entreprise getEntrepise() {
		return entrepise;
	}

	public void setEntrepise(Entreprise entrepise) {
		this.entrepise = entrepise;
	}

	public ProfilRemuneration getProfilRemuneration() {
		return profilRemuneration;
	}

	public void setProfilRemuneration(ProfilRemuneration profilRemuneration) {
		this.profilRemuneration = profilRemuneration;
	}

	public Grade getGrade() {
		return grade;
	}

	public void setGrade(Grade grade) {
		this.grade = grade;
	}

	public int getMatricule() {
		return matricule;
	}

	public void setMatricule(int matricule) {
		this.matricule = matricule;
	}

}
