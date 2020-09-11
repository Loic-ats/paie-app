package dev.paie.entite;

import java.math.BigDecimal;

public class AffichageListeBulletinSalaire {

	private int id;

	private BulletinSalaire bulletinSalaire;
	private Periode periode;
	private BigDecimal SalaireBrut;
	private BigDecimal NetImposable;
	private BigDecimal NetAPayer;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
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
