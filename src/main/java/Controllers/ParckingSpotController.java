package Controllers;

import java.time.LocalDateTime;
import java.time.ZoneId;

import javax.validation.Valid;

import org.springframework.beans.BeanUtils;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import Dto.ParckingSpotDto;
import Models.ParckingSpotModel;
import Services.ParckingSpotService;

@RestController
@CrossOrigin(originPatterns = "*", maxAge = 3600)
@RequestMapping("/parcking-spot")
public class ParckingSpotController {

	final ParckingSpotService parckingSpotService;

	public ParckingSpotController(ParckingSpotService parckingSpotService) {
		this.parckingSpotService = parckingSpotService;
	}

	@PostMapping
	public ResponseEntity<Object> SaveParckingSpot(@RequestBody @Valid ParckingSpotDto parckingSpotDto) {
		var parckingSpotModel = new ParckingSpotModel();
		BeanUtils.copyProperties(parckingSpotDto, parckingSpotModel);
		parckingSpotModel.setRegistrationDate(LocalDateTime.now(ZoneId.of("UTC")));
		return ResponseEntity.status(HttpStatus.CREATED).body(parckingSpotService.save(parckingSpotModel));
	}
}
