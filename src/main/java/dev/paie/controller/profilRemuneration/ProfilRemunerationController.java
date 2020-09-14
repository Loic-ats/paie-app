package dev.paie.controller.profilRemuneration;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;

import dev.paie.service.ProfilRemunerationService;

public class ProfilRemunerationController {

	private ProfilRemunerationService profilRemunerationService;

	public ProfilRemunerationController(ProfilRemunerationService profilRemunerationService) {
		this.profilRemunerationService = profilRemunerationService;
	}

	@GetMapping
	public ResponseEntity<?> getAllProfils() {

		List<CreerProfilRemunerationRequestDto> listeP = profilRemunerationService.listerProfils();

		if (!listeP.isEmpty()) {
			return ResponseEntity.status(HttpStatus.OK).header("message", "Profils trouvés").body(listeP);

		} else { // listeE.isEmpty = true
			return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Aucun Profil enregistré en BDD ");
		}

	}

}
