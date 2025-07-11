package com.vishal.country;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.vishal.country.model.Country;
import com.vishal.country.service.CountryService;

import java.util.List;
import org.springframework.context.ApplicationContext;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@SpringBootApplication
public class CountryApplication {

	private static final Logger LOGGER = LoggerFactory.getLogger(CountryApplication.class);

	private static CountryService countryService;

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(CountryApplication.class, args);
		countryService = context.getBean(CountryService.class);

		testGetAllCountries();
		try {
			testCountryFeatures();
		} catch (Exception e) {
			LOGGER.error("Exception occurred: {}", e.getMessage());
		}

	}

	private static void testGetAllCountries() {
		LOGGER.info("Start");
		List<Country> countries = countryService.getAllCountries();
		LOGGER.debug("countries={}", countries);
		LOGGER.info("End");
	}

	private static void testCountryFeatures() throws Exception {
    LOGGER.info("Start");

    // 1. Add new country
    Country newCountry = new Country();
    newCountry.setCode("JP");
    newCountry.setName("Japan");
    countryService.addCountry(newCountry);
    LOGGER.info("=== Adding Country JP ===");
    LOGGER.info("Added: {}", newCountry);

    // 2. Find by code
    Country country = countryService.findCountryByCode("JP");
    LOGGER.info("=== Finding Country JP ===");
    LOGGER.info("Found: {}", country);

    // 3. Update country
    countryService.updateCountry("JP", "Japan Updated");
    Country updatedCountry = countryService.findCountryByCode("JP");
    LOGGER.info("=== Updating Country JP ===");
    LOGGER.info("Updated: {}", updatedCountry);

    // 4. Find countries by partial name
    List<Country> partialCountries = countryService.findCountriesByPartialName("Uni");
    LOGGER.info("=== Searching for 'Uni' ===");
    LOGGER.info("Matching Countries: {}", partialCountries);

    // 5. Delete country
    countryService.deleteCountry("JP");
    LOGGER.info("=== Deleting Country JP ===");
    LOGGER.info("Deleted successfully.");

    LOGGER.info("End");
}


}
