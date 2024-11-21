package aplication;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import java.util.stream.Collectors;

import entitites.Product;

public class Exercicio1 {

	public static void main(String[] args) {
		// Fazer um programa para ler um conjunto de produtos a partir de um
		//arquivo em formato .csv (suponha que exista pelo menos um produto).
		//Em seguida mostrar o preço médio dos produtos. Depois, mostrar os
		//nomes, em ordem decrescente, dos produtos que possuem preço
		//inferior ao preço médio.
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		
		System.out.print("Entre com o caminho do arquivo");
		String path = sc.nextLine();
		
		try (BufferedReader br = new BufferedReader(new FileReader(path))){
			List<Product> list = new ArrayList<>();
			
			String line = br.readLine();
			while (line != null) {
				String[] fields = line.split(",");
				list.add(new Product(fields[0], Double.parseDouble(fields[1])));
				line = br.readLine();
			}
			
			double avg =  list.stream()//criado um pipeline para conseguir o preço medio da lista
					.map(p -> p.getPrice())//map para separar o nome do valor do produto
					.reduce(0.0, (x,y) -> x + y) / list.size();//feito um reduce para somar todos os valores, depois dividir pelo tamanho da lista
			System.out.println("Preço Medio: " + String.format("%.2f", avg));//print para mostrar o preço medio de todos os produtos
			
			Comparator<String> comp = (s1, s2) -> s1.toUpperCase().compareTo(s2.toUpperCase());//criado um comparator para filtrar as palavras
			
			List<String> names = list.stream()//criado um pipeline
					.filter(p -> p.getPrice() < avg)//para pegar o valor dos produtos abaixo da media
					.map(p -> p.getName())//depois pega o nome dos produtos
					.sorted(comp.reversed())//traz o comparator reverso, em vez de ordem crescente, vira ordem decrescente
					.collect(Collectors.toList());//cria a lista
			names.forEach(System.out::println);//faz uma chamada para todos os nomes
			
		}catch(IOException e) {
			System.out.println("Erro: " + e.getMessage());
		}
		sc.close();
	}

}
