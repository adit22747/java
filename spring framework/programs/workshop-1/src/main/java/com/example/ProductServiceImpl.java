package com.example;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductServiceImpl implements ProductService{
	@Autowired
	ProductRepository pr;

	@Override
	public void addProduct(Product p) {
		System.out.println(p);
		pr.save(p);
		
	}

	@Override
	public void updateProduct(Product p) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Product> listProduct() {
		List<Product> products = pr.findAll();
		return products;
	}

	@Override
	public boolean deleteProduct(int id) {
		pr.deleteById(id);
		return true;
	}

	@Override
	public Optional<Product> getId(int id) {
		return pr.findById(id);
	}
}
