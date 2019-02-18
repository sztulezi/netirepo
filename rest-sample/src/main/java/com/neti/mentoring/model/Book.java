package com.neti.mentoring.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Book {
	@Id
	@GeneratedValue
	private Long id;

	private String title;

	private String isbn;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("Book [id=").append(id);
		sb.append(", title=").append(title);
		sb.append(", isbn=").append(isbn);
		return sb.append("]").toString();
	}

}
