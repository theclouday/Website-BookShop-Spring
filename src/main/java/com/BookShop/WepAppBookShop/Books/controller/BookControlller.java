package com.BookShop.WepAppBookShop.Books.controller;

import com.BookShop.WepAppBookShop.Books.service.BookService;
import com.BookShop.WepAppBookShop.Books.repository.Book;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.*;


import java.util.List;
@RestController
@RequestMapping("/api/v1/")
@AllArgsConstructor
public class BookControlller {
    @Autowired
    private BookService bookService;

    @GetMapping("/all_books")
    public List<Book> findAllBooks() {
        return bookService.findAllBooks();
    }

    @GetMapping("/find_book/by_author/{author}")
    public List<Book> findByAuthor(@PathVariable String author) {
        return bookService.findBookByAuthor(author);
    }
    @GetMapping("/find_book/by_id/{id}")
    public List<Book> findById(@PathVariable Long id) {
        return bookService.findBookById(id);
    }

    @PostMapping("/create_books")
    public Book createBook(@RequestBody Book books){
        return bookService.createBook(books);
    }

    @DeleteMapping("/delete_book/{title}")
    public void deleteBookByTitle (@PathVariable String title) {
        bookService.deleteBookByTitle(title);
    }

}
