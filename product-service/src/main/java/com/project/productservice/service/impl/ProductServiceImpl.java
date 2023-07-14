package com.project.productservice.service.impl;

import com.project.productservice.dto.ProductDto;
import com.project.productservice.entity.Product;
import com.project.productservice.mapper.ProductMapper;
import com.project.productservice.repository.ProductRepository;
import com.project.productservice.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.stream.Collectors;

@Service
@Transactional
public class ProductServiceImpl implements ProductService {

    @Autowired
    private ProductRepository productRepository;

    @Override
    public ProductDto createProduct(ProductDto productDto) {
        Product product = ProductMapper.toEntity(productDto);
        Product createdProduct = productRepository.save(product);
        return ProductMapper.toDto(createdProduct);
    }

    @Override
    public List<ProductDto> getAllProducts() {
        List<Product> products = productRepository.findAll();
        return products.stream().map(ProductMapper::toDto).toList();
    }
}
