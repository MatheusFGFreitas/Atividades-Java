package aplication;

import java.util.Locale;
import java.util.Scanner;

import entities.Produtos;

public class ProgramaTV {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Produtos produtos = new Produtos();
		
		System.out.println("Entre os dados do produto: ");
		
		System.out.print("Nome: ");
		produtos.nome = sc.nextLine();
		
		System.out.print("Preço: ");
		produtos.preco = sc.nextDouble();
		
		System.out.print("quantidade no estoque: ");
		produtos.quantidade = sc.nextInt();
		
		System.out.println();
		System.out.println("dados do produto:" + produtos);
		
		System.out.println();
		System.out.print("Entre o numero de produtos para ser adicionado no estoque: ");
		int quantidade = sc.nextInt(); //codigo para adicionar produtos a variavel
		produtos.addProdutos(quantidade);
		
		System.out.println();
		System.out.println("Dados atualizados: " + produtos);
		
		System.out.println();
		System.out.print("Entre o numero de produtos para serem removidos do estoque: ");
		quantidade = sc.nextInt(); //codigo para remover produtos a variavel
		produtos.removerProdutos(quantidade);
		
		System.out.println();
		System.out.println("Dados atualizados: " + produtos);
		
		sc.close();
	}

}
