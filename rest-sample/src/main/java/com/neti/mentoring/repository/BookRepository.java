package com.neti.mentoring.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.neti.mentoring.model.Book;

// a jparepository kinal alapbol egy csomo hasznos metodust az entitas kezelesehez (find, save, delete, stb)
@Repository
public interface BookRepository extends JpaRepository<Book, Long> {

	// egyedi lekerdezes, spring data stilusban
	@Query("SELECT b FROM Book b WHERE LOWER(b.title) = LOWER(:title)")
	Book findByTitle(@Param("title") String title);

}
