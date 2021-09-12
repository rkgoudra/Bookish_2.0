package com.example.bookish.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.bookish.model.LentBookEntity;
import com.example.bookish.repository.LentBookRepository;

@Service
@Transactional
public class LentBookService {
	@Autowired
	LentBookRepository lentbookRepository;
	
	public String addLentBook(LentBookEntity lentbook) {
		try {
			if(lentbook.getLentbook_id()!=null) {
				LentBookEntity lentbookentity=lentbookRepository.findById(lentbook.getLentbook_id()).orElse(null);
				if(lentbookentity!=null) {
					lentbookentity.setBook_return_status(lentbook.getBook_return_status());
					lentbookentity.setDue_date(lentbook.getDue_date());
					lentbookRepository.save(lentbookentity);
					
				}
				return "LentBook updated successfully.";
			}
			else {
				lentbookRepository.save(lentbook);
			return "LentBook added successfully";
			}
		}catch(Exception e) {
			return "error while saving"+e;	
		}
		
	}
	public String deleteLentBooks(LentBookEntity lentbook) {
		try {
		if(lentbook.getLentbook_id()!=null) {
			lentbookRepository.deleteById(lentbook.getLentbook_id());
		}
		return "Lent Book Deleted successfully";
		}catch(Exception e) {
			return "error while Deleting"+e;	
		}
		
	}
	
	public List<LentBookEntity> viewLentBook() {
		try {
			return lentbookRepository.findAll();
		}catch(Exception e) {
			System.out.println("error while Fetching"+e);
		}
		return null;
	}

}
