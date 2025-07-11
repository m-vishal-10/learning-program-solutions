package com.vishal.country.service;



import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vishal.country.model.Country;
import com.vishal.country.repository.CountryRepository;

import jakarta.transaction.Transactional;

@Service
public class CountryService {

    @Autowired
    private CountryRepository countryRepository;

    // 1. Get all countries
    @Transactional
    public List<Country> getAllCountries() {
        return countryRepository.findAll();
    }

    // 2. Find country by code
    @Transactional
    public Country findCountryByCode(String code) throws Exception {
        Optional<Country> result = countryRepository.findById(code);
        if (result.isPresent()) {
            return result.get();
        } else {
            throw new Exception("Country not found with code: " + code);
        }
    }

    // 3. Add new country
    @Transactional
    public void addCountry(Country country) {
        countryRepository.save(country);
    }

    // 4. Update country
    @Transactional
    public void updateCountry(String code, String newName) throws Exception {
        Country country = findCountryByCode(code);
        country.setName(newName);
        countryRepository.save(country);
    }

    // 5. Delete country
    @Transactional
    public void deleteCountry(String code) throws Exception {
        Country country = findCountryByCode(code);
        countryRepository.delete(country);
    }

    // 6. Find countries by partial name
    @Transactional
    public List<Country> findCountriesByPartialName(String name) {
        return countryRepository.findByNameContainingIgnoreCase(name);
    }
}
