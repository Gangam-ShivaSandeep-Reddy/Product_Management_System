package com.product.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.product.demo.entity.Product;
import com.product.demo.repository.ProductRepository;

@Service
public class ProductServiceImpl implements ProductService {

	@Autowired
	private ProductRepository repository;

	@Override
	public Product saveProduct(Product product) {
		return repository.save(product);
	}

	@Override
	public List<Product> saveProducts(List<Product> products) {
		return repository.saveAll(products);
	}

	@Override
	public List<Product> getProducts() {
		return repository.findAll();
	}

	@Override
	public Product getProductById(int productId) {
		return repository.findById(productId).orElse(null);
	}

	@Override
	public Product getProductByName(String productName) {
		return repository.findByProductName(productName);
	}

	@Override
	public String deleteProduct(int productId) {
		repository.deleteById(productId);
		return "Product removed !! " + productId;
	}

	@Override
	public Product updateProduct(Product product, int productId) {
		Product existingProduct = repository.findById(productId).orElse(null);
		existingProduct.setProductName(product.getProductName());
		existingProduct.setProductQuantity(product.getProductQuantity());
		existingProduct.setProductPrice(product.getProductPrice());
		return repository.save(existingProduct);
	}
}



