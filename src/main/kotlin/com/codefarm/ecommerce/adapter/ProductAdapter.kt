package com.codefarm.ecommerce.adapter

import com.codefarm.ecommerce.constants.Properties.ID
import com.codefarm.ecommerce.errors.InvalidParameter
import com.codefarm.ecommerce.model.Product
import com.codefarm.ecommerce.model.api.ProductRequest
import com.codefarm.ecommerce.model.api.ProductResponse
import org.springframework.stereotype.Component

@Component
class ProductAdapter {
    fun toProduct(request: ProductRequest) = Product(
        name = request.name,
        price = request.price
    )

    fun toProductResponse(product: Product) = ProductResponse(
            id = product.id?: throw InvalidParameter(ID),
            name = product.name,
            price = product.price,
    )
} 