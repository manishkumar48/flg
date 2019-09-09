package com.prc.FlagPicker.dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import com.prc.FlagPicker.model.Country;

public interface CountryRepository extends CrudRepository<Country, String> {

	public  List<Country> findByCountryName(String countryName);
}



