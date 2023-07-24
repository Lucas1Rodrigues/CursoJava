package util;

import java.util.function.Consumer;

import entities.Product;

public class IncreasePrice implements Consumer<Product>{

	@Override
	public void accept(Product p) {
		 p.setPrice(p.getPrice()*1.10);
		
	}

}
