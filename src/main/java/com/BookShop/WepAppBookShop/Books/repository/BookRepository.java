package com.BookShop.WepAppBookShop.Books.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface BookRepository extends JpaRepository<Book, Long> {
    List<Book> findByTitle(String title);
    List<Book> findByAuthor(String author);
    List<Book> findAllById(Long id);
//    Book findById(Long id);
}
