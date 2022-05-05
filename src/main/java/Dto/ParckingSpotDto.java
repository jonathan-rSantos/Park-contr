package Dto;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

public class ParckingSpotDto {
	@NotBlank
	private String parckingSpotNumber;
	@NotBlank
	@Size(max = 7)
	private String licencePlateCar;
	@NotBlank
	private String brandCar;
	@NotBlank
	private String modelCar;
	@NotBlank
	private String colorCar;
	@NotBlank
	private String responsableName;
	@NotBlank
	private String apartament;
	@NotBlank
	private String block;

	public String getParckingSpotNumber() {
		return parckingSpotNumber;
	}

	public void setParckingSpotNumber(String parckingSpotNumber) {
		this.parckingSpotNumber = parckingSpotNumber;
	}

	public String getLicencePlateCar() {
		return licencePlateCar;
	}

	public void setLicencePlateCar(String licencePlateCar) {
		this.licencePlateCar = licencePlateCar;
	}

	public String getBrandCar() {
		return brandCar;
	}

	public void setBrandCar(String brandCar) {
		this.brandCar = brandCar;
	}

	public String getModelCar() {
		return modelCar;
	}

	public void setModelCar(String modelCar) {
		this.modelCar = modelCar;
	}

	public String getColorCar() {
		return colorCar;
	}

	public void setColorCar(String colorCar) {
		this.colorCar = colorCar;
	}

	public String getResponsableName() {
		return responsableName;
	}

	public void setResponsableName(String responsableName) {
		this.responsableName = responsableName;
	}

	public String getApartament() {
		return apartament;
	}

	public void setApartament(String apartament) {
		this.apartament = apartament;
	}

	public String getBlock() {
		return block;
	}

	public void setBlock(String block) {
		this.block = block;
	}

}
