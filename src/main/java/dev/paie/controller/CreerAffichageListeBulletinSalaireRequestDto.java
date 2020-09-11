package dev.paie.controller;

import java.math.BigDecimal;

import dev.paie.entite.BulletinSalaire;
import dev.paie.entite.Periode;

public class CreerAffichageListeBulletinSalaireRequestDto {

	private BulletinSalaire bulletinSalaire;
	private Periode periode;
	private BigDecimal SalaireBrut;
	private BigDecimal NetImposable;
	private BigDecimal NetAPayer;
	private BigDecimal PrimeExceptionnel;

	public BigDecimal getPrimeExceptionnel() {
		return PrimeExceptionnel;
	}

	public void setPrimeExceptionnel(BigDecimal primeExceptionnel) {
		PrimeExceptionnel = primeExceptionnel;
	}

	public BulletinSalaire getBulletinSalaire() {
		return bulletinSalaire;
	}

	public void setBulletinSalaire(BulletinSalaire bulletinSalaire) {
		this.bulletinSalaire = bulletinSalaire;
	}

	public Periode getPeriode() {
		return periode;
	}

	public void setPeriode(Periode periode) {
		this.periode = periode;
	}

	public BigDecimal getSalaireBrut() {
		return SalaireBrut;
	}

	public void setSalaireBrut(BigDecimal salaireBrut) {
		SalaireBrut = salaireBrut;
	}

	public BigDecimal getNetImposable() {
		return NetImposable;
	}

	public void setNetImposable(BigDecimal netImposable) {
		NetImposable = netImposable;
	}

	public BigDecimal getNetAPayer() {
		return NetAPayer;
	}

	public void setNetAPayer(BigDecimal netAPayer) {
		NetAPayer = netAPayer;
	}

}
