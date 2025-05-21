package com.sun.bookstore.model

import jakarta.persistence.Entity
import jakarta.persistence.Id
import jakarta.persistence.GeneratedValue
import jakarta.persistence.GenerationType
import java.util.UUID

@Entity
data class Book(
        @Id
        @GeneratedValue(strategy = GenerationType.UUID)
        val id: UUID,
        val title: String,
        val blurb: String,
        val price: Int
)