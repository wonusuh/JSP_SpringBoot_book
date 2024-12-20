package ch08;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ProductService {
	Map<String, Product> products = new HashMap<>();

	public ProductService() {
		Product p = new Product("101", "애플사과폰 12", "애플전자", "2020.12.12", 1200000);
		products.put("101", p);
		p = new Product("102", "삼전우주폰 21", "삼전전자", "2021.02.02", 1300000);
		products.put("102", p);
		p = new Product("103", "엘스듀얼폰", "엘스전자", "2021.03.02", 1400000);
		products.put("103", p);
	}

	public List<Product> findAll() {
		return new ArrayList<>(products.values());
	}

	public Product findById(String id) {
		return products.get(id);
	}
}
