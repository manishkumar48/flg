package com.prc.FlagPicker.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.prc.FlagPicker.model.Continents;
import com.prc.FlagPicker.model.Country;
import com.prc.FlagPicker.service.FlagPickerService;



	@RestController
	@RequestMapping("/flag")
	public class FlagController {

		@Autowired
		FlagPickerService flagPickerService;
	    @GetMapping("/country")
	    Map<String,String> getFlagContries(@RequestBody Country cn){
	    	
	    	Map<String,String> m=new HashMap<String,String>();
	    	m.put(cn.getCountryName(),flagPickerService.getFlagByCountry(cn.getCountryName()));
	        return m;
	    }
	    @GetMapping("/continent")
	    List<Continents> getFlagContinents(@RequestBody Continents cn){
	    	List <Continents>l=new ArrayList<Continents>();
	        return flagPickerService.getFlagByContinent(cn.getName());
	    }
}
