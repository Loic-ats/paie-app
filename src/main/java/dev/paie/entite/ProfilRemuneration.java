package dev.paie.entite;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.JoinColumn;

@Entity
public class ProfilRemuneration {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	private String code;

	 @ManyToMany 
	 @JoinTable(name = "profilRemuneration_avantages", joinColumns = @JoinColumn(name = "profilRemuneration_id", referencedColumnName = "id"),
	 inverseJoinColumns = @JoinColumn(name = "avantages_id", referencedColumnName = "id"))
	 private List<Avantage> avantages;
	 
	 @ManyToMany 
	 @JoinTable(name = "profilRemuneration_cotisations", joinColumns = @JoinColumn(name = "profilRemuneration_id", referencedColumnName = "id"),
	 inverseJoinColumns = @JoinColumn(name = "cotisations_id", referencedColumnName = "id"))
	 private List<Cotisation> cotisations;
	 
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public List<Cotisation> getCotisations() {
		return cotisations;
	}

	public void setCotisations(List<Cotisation> cotisations) {
		this.cotisations = cotisations;
	}

	public List<Avantage> getAvantages() {
		return avantages;
	}

	public void setAvantages(List<Avantage> avantages) {
		this.avantages = avantages;
	}

}
