package com.BookShop.WepAppBookShop.Books.service;

import com.BookShop.WepAppBookShop.Books.repository.Book;
import com.BookShop.WepAppBookShop.Books.repository.BookRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class BookService {

    private final BookRepository book;
    public List<Book> findAllBooks() {
        return book.findAll();
    }

    public Book createBook(Book books){
        return book.save(books);
    }

    public List<Book> findBookById (Long id) {
        return book.findAllById(id);
    }

    public List<Book> findBookByAuthor(String author) {
        return book.findByAuthor(author);
    }
    public void deleteBookByTitle(String title) {
        List<Book> bookToDelete = book.findByTitle(title);
        book.deleteAll(bookToDelete);
    }


}
