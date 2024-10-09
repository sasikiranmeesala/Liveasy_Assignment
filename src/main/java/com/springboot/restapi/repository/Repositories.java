package com.springboot.restapi.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;


import com.springboot.restapi.entity.LoadClass;

@Repository
public interface Repositories extends JpaRepository<LoadClass, Long> {

	 @Query("SELECT l.shipperid FROM LoadClass l")
	    List<String> findAllShipperIds();
}
