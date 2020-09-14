package dev.paie.service;

import org.springframework.stereotype.Service;

import dev.paie.repository.AvantageRepository;

@Service
public class AvantageService {

	private AvantageRepository AvantageRepository;

	public AvantageService(AvantageRepository AvantageRepository) {
		this.AvantageRepository = AvantageRepository;
	}
}
