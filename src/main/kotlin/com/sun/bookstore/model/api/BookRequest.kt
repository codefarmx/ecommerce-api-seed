package com.sun.bookstore.model.api

data class BookRequest(
    val title: String,
    val blurb: String,
    val price: Int
) 