package com.springboot.restapi.service;

import java.util.List;



import com.springboot.restapi.entity.LoadClass;

public interface LoadService {
	
	public LoadClass saveload(LoadClass loadclass);
	public LoadClass update(LoadClass loadclass);
	public void delete(long id);
	public LoadClass loadid(long id);
	public List<LoadClass> loadall(); 
	public List<String> shipperid();
	

}
