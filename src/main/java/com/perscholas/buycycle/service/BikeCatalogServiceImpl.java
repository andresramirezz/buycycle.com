/**
 * @author Andres Ramirez
 * File: BikeCatalogServiceImpl.java
 * Date 02/29/2020
 * 
 */


package com.perscholas.buycycle.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.perscholas.buycycle.dao.BikeRepository;
import com.perscholas.buycycle.model.BikeCatalog;

@Service
public class BikeCatalogServiceImpl implements BikeCatalogService{
	
	@Autowired
	private BikeRepository bikeRepository;
	
	public BikeCatalog save ( BikeCatalog bc ) {
		return bikeRepository.save(bc);
	}

	
	public List<BikeCatalog> findAll() {
		return (List<BikeCatalog>) bikeRepository.findAll();
	}

}
