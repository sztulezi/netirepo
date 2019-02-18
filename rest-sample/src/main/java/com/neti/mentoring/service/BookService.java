package com.neti.mentoring.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.stereotype.Service;

import com.neti.mentoring.exception.MyResourceNotFoundException;
import com.neti.mentoring.model.Book;
import com.neti.mentoring.repository.BookRepository;

// az uzleti logika helye... szerencses esetben csak tovabbhiv
// kevesbe szerencses esetben van benne kod, es hivogathat repository-kat, mas service-eket
@Service
public class BookService {

	// repository: a perzisztencia reteg kapuja
	@Autowired
	private BookRepository bookRepository;

	public List<Book> findAll() {
		return bookRepository.findAll();
	}

	public Book findOne(Long id) {
		Book book = new Book();
		book.setId(id);
		return bookRepository.findOne(Example.of(book)).orElseThrow(MyResourceNotFoundException::new);
	}

	public Long create(Book book) {
		return bookRepository.save(book).getId();
	}

	public void update(Book book) {
		bookRepository.save(book);
	}

	public void deleteById(Long id) {
		bookRepository.deleteById(id);
	}

	public Book getById(Long id) {
		return bookRepository.getOne(id);
	}

}
