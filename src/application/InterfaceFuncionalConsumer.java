package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

import entities.Product;
import util.PriceUpdateConsumer;

public class InterfaceFuncionalConsumer {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		List<Product> list = new ArrayList();
		
		list.add(new Product("Tv", 900.0));
		list.add(new Product("Mouse", 50.0));
		list.add(new Product("Tablet", 350.0));
		list.add(new Product("HD cas",  80.90));
		
		list.forEach(new PriceUpdateConsumer());
		// esse forEach é um defaultMethod que receebe um Consumer como argumento
		
		list.forEach(System.out::println);// isso é um referenc
		// method para o println e faz também impressão na tela
		
	}

}
