package com.springboot.restapi.service;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springboot.restapi.entity.LoadClass;
import com.springboot.restapi.repository.Repositories;

@Service
public class ServiceImplimentation implements LoadService{
	
	@Autowired
	private Repositories repositories;

	@Override
	public LoadClass saveload(LoadClass loadclass) {
		// TODO Auto-generated method stub
		return repositories.save(loadclass);
	}

	@Override
	public LoadClass update(LoadClass loadclass) {
		// TODO Auto-generated method stub
		return repositories.save(loadclass);
	}

	@Override
	public void delete(long id) {
		// TODO Auto-generated method stub
		repositories.deleteById(id);
		
	}

	@Override
	public LoadClass loadid(long id) {
		// TODO Auto-generated method stub
		return repositories.findById(id).get();
	}

	@Override
	public List<LoadClass> loadall() {
		// TODO Auto-generated method stub
		return repositories.findAll();
	}

	@Override
	public List<String> shipperid() {
		// TODO Auto-generated method stub
		return repositories.findAllShipperIds();
	}

}
