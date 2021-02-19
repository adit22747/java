package com.example;

import java.util.List;
import java.util.Optional;

public interface ProductService {
	public void addProduct(Product p);
	public void updateProduct(Product p);
	public List<Product> listProduct();
	public boolean deleteProduct(int id);
	public Optional<Product> getId(int id);
}
