package com.sun.bookstore.service

import com.sun.bookstore.model.Book
import com.sun.bookstore.repository.BookRepository
import org.springframework.stereotype.Service

@Service
class BookService(private val bookRepository: BookRepository) {
    
    fun getAllBooks(): List<Book> = bookRepository.findAll()

    fun createBook(book: Book) = bookRepository.save(book)
} 