package aplication;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

import entitites.Product;

public class InterfaceFunction {

	public static void main(String[] args) {
		//Function é uma interface funcional que tem dois parametros, que recebe um objeto, e retorna outro objeto
		
		List<Product> list = new ArrayList<>();
		
		list.add(new Product("Tv", 900.00));
		list.add(new Product("Mouse", 50.00));
		list.add(new Product("Tablet", 350.50));
		list.add(new Product("HD Case", 80.90));
		
		//Function<Product, String> func = p -> p.getName().toUpperCase();
		
		//para deixar todos os nomes em capslock utilizaremos a função map(não é a estrutura de dados map)
		//map é uma função que aplica uma função a todos os elementos de uma stream
		//stream é uma sequencia de dados, tera uma aula especifica de stream
		
		//List<String> names = list.stream().map(new UppercaseName()).collect(Collectors.toList());
		//faz a lista virar uma stream, aplica a function, e transforma a stream em lista de novo
		
		//List<String> names = list.stream().map(Product::staticUppercaseName).collect(Collectors.toList());
		//dessa vez com metodo estatico
		
		//List<String> names = list.stream().map(Product::nonStaticUppercaseName).collect(Collectors.toList());
		//metodo não estatico
		
		//List<String> names = list.stream().map(func).collect(Collectors.toList());
		//expressão lambda declarada
		
		List<String> names = list.stream().map(p -> p.getName().toUpperCase()).collect(Collectors.toList());
		//expressão lambda inline
		
		names.forEach(System.out::println);//feito um for each para imprimir da lista names

	}

}
