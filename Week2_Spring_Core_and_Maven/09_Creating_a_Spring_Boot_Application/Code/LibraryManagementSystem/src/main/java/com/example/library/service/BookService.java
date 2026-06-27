package com.example.library.service;

import com.example.library.entity.Book;
import com.example.library.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookService {

    private BookRepository bookRepository;

    @Autowired
    public BookService(BookRepository bookRepository){
        this.bookRepository = bookRepository;
    }

    public List<Book> getAllBooks(){
        return bookRepository.findAll();
    }

    public String addBook(Book book) {
        try {
            bookRepository.save(book);
            return "Book Added Successfully";
        } catch (IllegalArgumentException e) {
            return "Invalid book data: " + e.getMessage();
        } catch (RuntimeException e) {
            return "Error adding book: " + e.getMessage();
        }
    }

    public Book getBookById(int id) {
        try {
            return bookRepository.findById(id).orElseGet(Book::new);
        } catch (IllegalArgumentException e) {
            return new Book();
        } catch (RuntimeException e) {
            return new Book();
        }
    }

    public String deleteBookById(int id) {
        try {
            bookRepository.deleteById(id);
            return "Book Deleted Successfully";
        } catch (IllegalArgumentException e) {
            return "Invalid id: " + e.getMessage();
        } catch (RuntimeException e) {
            return "Error deleting book: " + e.getMessage();
        }
    }

    public String updateBookById(Book book) {
        try {
            bookRepository.save(book);
            return "Book Updated Successfully";
        } catch (IllegalArgumentException e) {
            return "Invalid book data: " + e.getMessage();
        } catch (RuntimeException e) {
            return "Error updating book: " + e.getMessage();
        }
    }
}