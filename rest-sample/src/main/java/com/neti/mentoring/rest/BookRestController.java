package com.neti.mentoring.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.google.common.base.Preconditions;
import com.neti.mentoring.model.Book;
import com.neti.mentoring.service.BookService;

// @RestController: @Controller, @ResponseBody
// @RequestMapping(endpoint): definialja a rest vegpont nevet

@RestController
@RequestMapping("books")
public class BookRestController {

	// a service(ek), ahova tovabbhiv, elvileg (nullvalidacion kivul) semmi mas dolga nem szabad hogy legyen
	@Autowired
	private BookService service;

	// GET / --> 200 OK, List<Book>
	@GetMapping
	public List<Book> findAll() {
		return service.findAll();
	}

	// GET /{id} --> 200 OK, Book
	@GetMapping("{id}")
	public Book findOne(@PathVariable("id") Long id) {
		return RestPreconditions.checkFound(service.findOne(id));
	}

	// POST / [Book] --> 201 OK {id}
	@PostMapping
	@ResponseStatus(HttpStatus.CREATED)
	public Long create(@RequestBody Book resource) {
		Preconditions.checkNotNull(resource);
		return service.create(resource);
	}

	// PUT /{id} [Book] --> 200 OK
	@PutMapping("{id}")
//	@ResponseStatus(HttpStatus.OK)
	public void update(@PathVariable("id") Long id, @RequestBody Book resource) {
		Preconditions.checkNotNull(resource);
		Preconditions.checkNotNull(service.getById(resource.getId()));
		service.update(resource);
	}

	// DELETE /{id} --> 200 OK
	@DeleteMapping("{id}")
	@ResponseStatus(HttpStatus.OK)
	public void delete(@PathVariable("id") Long id) {
		service.deleteById(id);
	}

}
