package nLayeredDemo.business.abstracts;

import java.util.List;

import nLayeredDemo.entities.concretes.Product;

public interface ProductService { // service'ler iş sınıflarının interface'i
	void add(Product product);
	List<Product> getAll();
}
