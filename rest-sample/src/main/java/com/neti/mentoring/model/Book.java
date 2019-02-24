package com.neti.mentoring.model;

import javax.persistence.Column;
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

	@Column(insertable = false, updatable = false, nullable = false)
	// @ColumnDefault("'G'")
	private String kamu;

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

	public String getKamu() {
		return kamu;
	}

	public void setKamu(String kamu) {
		this.kamu = kamu;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("Book [id=").append(id);
		sb.append(", title=").append(title);
		sb.append(", isbn=").append(isbn);
		sb.append(", kamu=").append(kamu);
		return sb.append("]").toString();
	}

}
