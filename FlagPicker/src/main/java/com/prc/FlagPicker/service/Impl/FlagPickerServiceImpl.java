package com.prc.FlagPicker.service.Impl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.prc.FlagPicker.dao.ContinentRepository;
import com.prc.FlagPicker.dao.CountryRepository;
import com.prc.FlagPicker.model.Continents;
import com.prc.FlagPicker.service.FlagPickerService;
@Service
@Transactional(rollbackFor=Exception.class)
public class FlagPickerServiceImpl implements FlagPickerService{

    @Autowired
    private CountryRepository countryRepository;
    @Autowired
    private ContinentRepository continentRepository;
    
	@Override
	public String getFlagByCountry(String name) {
		return countryRepository.findByCountryName(name).get(0).getFlag();
	}

	@Override
	public List<Continents> getFlagByContinent(String name) {
		//continentRepository.findByName(name);
		return continentRepository.findByName(name);
	}

}
