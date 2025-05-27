package com.sun.bookstore.controller

import com.sun.bookstore.adapter.BookAdapter
import com.sun.bookstore.model.api.BookRequest
import com.sun.bookstore.model.Book
import com.sun.bookstore.service.BookService
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/api/books")
class BookController(
    private val bookService: BookService,
    private val adapter: BookAdapter
) {

    @GetMapping
    fun getAllBooks(): List<Book> = bookService.getAllBooks()

    @PostMapping
    fun createBook(@RequestBody request: BookRequest) = request
            .let { adapter.toBook(request) }
            .let { bookService.createBook(it) }
            .let { adapter.toBookResponse(it) }
} 