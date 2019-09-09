package com.prc.FlagPicker.service;

import java.util.List;
import java.util.Map;

import com.prc.FlagPicker.model.Continents;


public interface FlagPickerService {
	public String getFlagByCountry(String name);
	public List<Continents> getFlagByContinent(String name);
	

}
