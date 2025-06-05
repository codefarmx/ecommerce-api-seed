package com.codefarm.ecommerce.service

import com.codefarm.ecommerce.model.Product
import com.codefarm.ecommerce.repository.ProductRepository
import org.springframework.stereotype.Service

@Service
class ProductService(private val productRepository: ProductRepository) {
    
    fun getAll(): List<Product> = productRepository.findAll()

    fun create(product: Product) = productRepository.save(product)
} 