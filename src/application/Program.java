package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.stream.Collectors;

import entities.Product;
import util.UpperCaseName;

public class Program {

	public static void main(String[] args) {

		//Unidade de medida padrão EUA
		Locale.setDefault(Locale.US);
		
		// Lista de produtos do tipo array
		List<Product> list = new ArrayList<>();
		
		// adicionando os produtos
		list.add(new Product("Tv", 900.00));
		list.add(new Product("Mouse", 50.00));
		list.add(new Product("Tablet", 350.50));
		list.add(new Product("HD Case", 80.90));
		
		// Utilizando o STREAM para utilizar o MAP com o UpperCaseName(), e tranformando novamente a STREAM em LIST de novo, chamando uma nova lista de 'name'
		//List<String> names = list.stream().map(new UpperCaseName()).collect(Collectors.toList());
		
		// Método não estático
		List<String> names = list.stream().map(Product::staticUpperCaseName).collect(Collectors.toList());
		
		// Percorrendo toda lista e imprimindo-a
		names.forEach(System.out::println);
		
	}

}
