package com.sun.bookstore.adapter

import com.sun.bookstore.constants.Properties.ID
import com.sun.bookstore.errors.InvalidParameter
import com.sun.bookstore.model.Book
import com.sun.bookstore.model.api.BookRequest
import com.sun.bookstore.model.api.BookResponse
import org.springframework.stereotype.Component

@Component
class BookAdapter {
    fun toBook(request: BookRequest) = Book(
        title = request.title,
        blurb = request.blurb,
        price = request.price
    )

    fun toBookResponse(book: Book) = BookResponse(
            id = book.id?: throw InvalidParameter(ID),
            title = book.title,
            blurb = book.blurb,
            price = book.price
    )
} 