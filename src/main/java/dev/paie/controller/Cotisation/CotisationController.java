package dev.paie.controller.Cotisation;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import dev.paie.service.CotisationService;

@RestController
@RequestMapping("cotisation")
public class CotisationController {

	private CotisationService cotisationService;

	public CotisationController(CotisationService cotisationService) {
		super();
		this.cotisationService = cotisationService;
	}

	@GetMapping("all")
	public ResponseEntity<?> getAllCotisations() {

		List<CreerCotisationReponseDto> listeC = cotisationService.listerCotisations();

		if (!listeC.isEmpty()) {
			return ResponseEntity.status(HttpStatus.OK).header("message", "Cotisations trouvées").body(listeC);

		} else { // listeE.isEmpty = true
			return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Aucune cotisation enregistrée en BDD ");
		}

	}
}