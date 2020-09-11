package dev.paie.controller;

import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import dev.paie.entite.Avantage;
import dev.paie.entite.Cotisation;
import dev.paie.entite.Employe;
import dev.paie.entite.Entreprise;
import dev.paie.entite.Grade;
import dev.paie.entite.ProfilRemuneration;
import dev.paie.service.EmployeService;

@WebMvcTest(EmployeController.class)
public class EmployeControllerTest {

	@Autowired
	private MockMvc mockMvc;

	@MockBean
	private EmployeService employeService;

	@Test
	void testcreerEmploye() throws Exception {

		Entreprise entreprise = new Entreprise("15222225", "System U", "Rue de Paris", "147888", "1474414");

		List<Avantage> avantage = new ArrayList<Avantage>();
		List<Cotisation> cotisation = new ArrayList<Cotisation>();

		ProfilRemuneration profilRemuneration = new ProfilRemuneration("Cadre", avantage, cotisation);

		Grade grade = new Grade("GRADE_B", new BigDecimal(15444), new BigDecimal(5784));

		Employe employe = new Employe(entreprise, profilRemuneration, grade);

		Mockito.when(employeService.creerNouveauEmploye(entreprise, profilRemuneration, grade)).thenReturn(employe);
		mockMvc.perform(MockMvcRequestBuilders.post("/employe").contentType(MediaType.APPLICATION_JSON).content(
				"{\"entreprise.getDenomination\": \"System U\", \"profilRemuneration.getCode\":\"Cadre\", \"grade.getCode\": \"GRADE_B\" }")
				.accept(MediaType.APPLICATION_JSON)).andExpect(status().isOk());

	}

}
