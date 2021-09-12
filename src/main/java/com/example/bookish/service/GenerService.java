package com.example.bookish.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.bookish.model.GenerEntity;
import com.example.bookish.repository.GenerRepository;

@Service
@Transactional
public class GenerService {
	@Autowired
	GenerRepository generRepository;
	public String addGener(GenerEntity gener) {
		try {
			if(gener.getGener_id()!=null) {
				GenerEntity generentity=generRepository.findById(gener.getGener_id()).orElse(null);
				if(generentity!=null) {
					generentity.setGener_name(gener.getGener_name());
					generentity.setGener_status(gener.getGener_status());
					generRepository.save(generentity);
					
				}
				return "Gener updated successfully.";
			}else {
				generRepository.save(gener);
				return "Gener added successfully";
			}
			
		}catch(Exception e) {
			return "error while saving"+e;
		}
		
	}
	
	public String deleteGener(GenerEntity gener) {
		try {
		if(gener.getGener_id()!=null) {
			generRepository.deleteById(gener.getGener_id());
		}
		return "Gener Deleted successfully";
		}catch(Exception e) {
			return "error while Deleting"+e;	
		}
		
	}

	public List<GenerEntity> viewGener() {
		try {
			return generRepository.findAll();
		}catch(Exception e) {
			System.out.println("error while Fetching"+e);
		}
		return null;
	}
}
