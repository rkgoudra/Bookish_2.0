package com.example.bookish.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.bookish.model.BookEntity;
import com.example.bookish.model.BorrowedBookEntity;
import com.example.bookish.repository.BorrowedBookRepository;

@Service
@Transactional
public class BorrowedBookService {
	@Autowired
	BorrowedBookRepository borrowedbookRepository;

	public String addBorrowedBooks(BorrowedBookEntity borrowedbook) {
		try {
			if(borrowedbook.getId()!=null) {
				BorrowedBookEntity borrowedbookentity=borrowedbookRepository.findById(borrowedbook.getId()).orElse(null);
				if(borrowedbookentity!=null) {
					borrowedbookentity.setBorrow_from(borrowedbook.getBorrow_from());
					borrowedbookentity.setBook_return_status(borrowedbook.getBook_return_status());
					borrowedbookRepository.save(borrowedbook);
					
				}
				return "Borrowed Book updated successfully.";
			}else {
				borrowedbookRepository.save(borrowedbook);
				return "Borrowed Book added successfully";
			}
			
		}catch(Exception e) {
			return "error while saving"+e;
			
		}
	}
	
	public String deleteBorrowedBooks(BorrowedBookEntity borrowedbooks) {
		try {
		if(borrowedbooks.getId()!=null) {
			borrowedbookRepository.deleteById(borrowedbooks.getId());
		}
		return "Borrowed Book Deleted successfully";
		}catch(Exception e) {
			return "error while Deleting"+e;	
		}
		
	}
	
	public List<BorrowedBookEntity> viewBorrowedBooks() {
		try {
			return borrowedbookRepository.findAll();
		}catch(Exception e) {
			System.out.println("error while Fetching"+e);
		}
		return null;
	}
}
