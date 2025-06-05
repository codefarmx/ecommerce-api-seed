package com.codefarm.ecommerce.controller

import com.codefarm.ecommerce.adapter.ProductAdapter
import com.codefarm.ecommerce.model.Product
import com.codefarm.ecommerce.model.api.ProductRequest
import com.codefarm.ecommerce.service.ProductService
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/api/products")
class ProductController(
    private val productService: ProductService,
    private val adapter: ProductAdapter
) {

    @GetMapping
    fun getAllProducts(): List<Product> = productService.getAll()

    @PostMapping
    fun createProduct(@RequestBody request: ProductRequest) = request
            .let { adapter.toProduct(request) }
            .let { productService.create(it) }
            .let { adapter.toProductResponse(it) }
} 