package util;

import java.util.function.Function;

import entities.Product;

public class UpperCaseName implements Function<Product, String> {
	
	
	// Interface funcional que vai modificar todos os nomes para MAIUSCULO
	@Override
	public String apply(Product p) {
		return p.getName().toUpperCase();
	}

}
