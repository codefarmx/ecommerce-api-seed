package com.sun.bookstore.model

import jakarta.persistence.*
import java.util.UUID

@Entity
data class Book(
        @Id @GeneratedValue(strategy = GenerationType.UUID) val id: UUID? = null,
        @Version val version: Int? = null,
        val title: String,
        val blurb: String,
        val price: Int,
)