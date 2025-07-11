package com.vishal.handson.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.vishal.handson.model.Country;
@Repository
public interface CountryRepository extends JpaRepository<Country, String> {
    List<Country> findByNameContainingIgnoreCase(String name);
    List<Country> findByNameContainingIgnoreCaseOrderByNameAsc(String name);
    List<Country> findByNameStartingWith(String prefix);
}
