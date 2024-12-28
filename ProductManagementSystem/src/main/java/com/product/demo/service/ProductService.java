package com.product.demo.service;

import java.util.List;

import com.product.demo.entity.Product;

public interface ProductService {
    Product saveProduct(Product product);
    List<Product> saveProducts(List<Product> products);
    List<Product> getProducts();
    Product getProductById(int productId);
    Product getProductByName(String productName);
    String deleteProduct(int productId);
    Product updateProduct(Product product, int productId);
}
