package com.codefarm.ecommerce.model

import jakarta.persistence.*
import java.util.*

@Entity
data class Product(
        @Id @GeneratedValue(strategy = GenerationType.UUID) val id: UUID? = null,
        @Version val version: Int? = null,
        val name: String,
        val price: Int,
)