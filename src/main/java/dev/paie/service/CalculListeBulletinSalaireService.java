package dev.paie.service;

import java.math.BigDecimal;
import java.util.List;

import dev.paie.entite.BulletinSalaire;
import dev.paie.entite.Cotisation;
import dev.paie.entite.Grade;

public class CalculListeBulletinSalaireService {

	private Grade grade;
	private BulletinSalaire bulletinSalaire;
	private BigDecimal SalaireBase;
	private BigDecimal SalaireBrut;
	private BigDecimal TotalRetenuSalarial;
	private BigDecimal NetImposable;
	private BigDecimal NetAPayer;
	private BigDecimal somme;

	public BigDecimal SalaireBrut(BigDecimal SalaireBase) {

		SalaireBase = grade.getNbHeuresBase().multiply(grade.getTauxBase());

		SalaireBrut = SalaireBase.add(bulletinSalaire.getPrimeExceptionnelle());

		return SalaireBrut;

	}

	public BigDecimal NetImpossable(List<Cotisation> listCotisation) {

		SalaireBase = grade.getNbHeuresBase().multiply(grade.getTauxBase());
		SalaireBrut = SalaireBase.add(bulletinSalaire.getPrimeExceptionnelle());

		for (Cotisation cotis : listCotisation) {

			if (cotis.getImposable() == false) {

				somme = cotis.getTauxSalarial().multiply(SalaireBrut);
				TotalRetenuSalarial = TotalRetenuSalarial.add(somme);
			}
		}

		NetImposable = SalaireBrut.subtract(TotalRetenuSalarial);
		return NetImposable;
	}

	public BigDecimal NetAPayer(List<Cotisation> listCotisation) {

		SalaireBase = grade.getNbHeuresBase().multiply(grade.getTauxBase());
		SalaireBrut = SalaireBase.add(bulletinSalaire.getPrimeExceptionnelle());

		for (Cotisation cotis : listCotisation) {

			if (cotis.getImposable() == true) {

				somme = cotis.getTauxSalarial().multiply(SalaireBrut);
				TotalRetenuSalarial = TotalRetenuSalarial.add(somme);
			}
		}

		NetAPayer = NetImposable.subtract(TotalRetenuSalarial);
		return NetAPayer;
	}

}
