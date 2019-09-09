package com.prc.FlagPicker.dao;
import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.prc.FlagPicker.model.Continents;
public interface  ContinentRepository 	extends CrudRepository<Continents, String> {

		public  List<Continents> findByName(String name);
}
