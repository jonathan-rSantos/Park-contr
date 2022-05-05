package Repository;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import Models.ParckingSpotModel;
@Repository
public interface ParckingSpotRepository extends JpaRepository<ParckingSpotModel, UUID> {

	
}
