package Services;

import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import Models.ParckingSpotModel;
import Repository.ParckingSpotRepository;

@Service
public class ParckingSpotService {


	final ParckingSpotRepository parckingSpotRepository;

	public ParckingSpotService(ParckingSpotRepository parckingSpotRepository) {
		this.parckingSpotRepository = parckingSpotRepository;
	}
	@Transactional
	public ParckingSpotModel save(ParckingSpotModel parckingSpotModel) {
		return parckingSpotRepository.save(parckingSpotModel);
	}
	
	
}
