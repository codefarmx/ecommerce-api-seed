package com.sun.bookstore.model.api

import java.util.UUID

data class BookResponse(
        val id: UUID,
        val title: String,
        val blurb: String,
        val price: Int
) 