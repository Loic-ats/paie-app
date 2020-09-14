package dev.paie.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import dev.paie.controller.Cotisation.CreerCotisationReponseDto;
import dev.paie.entite.Cotisation;
import dev.paie.repository.CotisationRepository;

@Service
public class CotisationService {

	private CotisationRepository CotisationRepository;

	public CotisationService(CotisationRepository CotisationRepository) {
		this.CotisationRepository = CotisationRepository;
	}

	public List<CreerCotisationReponseDto> listerCotisations() {

		List<CreerCotisationReponseDto> listDto = new ArrayList();

		List<Cotisation> listeCotisations = CotisationRepository.findAll();

		for (Cotisation cotisation : listeCotisations) {
			listDto.add(new CreerCotisationReponseDto(cotisation));
		}

		return listDto;
	}
}
