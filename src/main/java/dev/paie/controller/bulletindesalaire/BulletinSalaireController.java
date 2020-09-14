package dev.paie.controller.bulletindesalaire;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import dev.paie.service.BulletinSalaireService;

@RestController
@RequestMapping("bulletin")
public class BulletinSalaireController {

	private BulletinSalaireService bulletinSalaireService;

	public BulletinSalaireController(BulletinSalaireService bulletinSalaireService) {
		super();
		this.bulletinSalaireService = bulletinSalaireService;
	}

	@GetMapping("all")
	public ResponseEntity<?> getAllBulletins() {

		List<CreerBulletinSalaireReponseDto> listeB = bulletinSalaireService.listerBulletins();

		if (!listeB.isEmpty()) {
			return ResponseEntity.status(HttpStatus.OK).header("message", "Bulletins trouvés").body(listeB);

		} else { // listeE.isEmpty = true
			return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Aucun bulletin enregistré en BDD ");
		}

	}

	@GetMapping("{id}")
	public ResponseEntity<?> getBulletin(@PathVariable int id) {

		BulletinSalairePrecisDto reponse = bulletinSalaireService.getBulletin(id);

		if (reponse != null) {
			return ResponseEntity.status(HttpStatus.OK).header("message", "Bulletin trouvé").body(reponse);

		} else { // listeE.isEmpty = true
			return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Aucun bulletin enregistré en BDD avec cet ID ");
		}
	}
}
