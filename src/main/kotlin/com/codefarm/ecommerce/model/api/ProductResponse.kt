package com.codefarm.ecommerce.model.api

import java.util.UUID

data class ProductResponse(
        val id: UUID,
        val name: String,
        val price: Int
) 