package Application;

import java.util.Locale;
import java.util.Scanner;

import Entities.Produto;

public class TvEmEstoque {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Produto produto = new Produto();
		System.out.println("Entre os dados do produto: ");
		System.out.print("Nome: ");
		produto.nome = sc.nextLine();
		System.out.print("Preco: ");
		produto.preco = sc.nextDouble();
		System.out.print("Quantidade no estoque: ");
		produto.quantidade = sc.nextInt();
		
		System.out.println();
		System.out.println("dados do produto: " + produto);
		
		System.out.println();
		System.out.print("Entre com o numero de produtos para ser adicionados no estoque: ");
		int quantidade = sc.nextInt();
		produto.addProdutos(quantidade);
		
		System.out.println("Dados atualizados: " + produto);
		
		System.out.println();
		System.out.print("Entre com o numero de produtos para ser removido do estoque: ");
		quantidade = sc.nextInt();
		produto.removerProdutos(quantidade);
		
		System.out.println();
		System.out.println("Dados atualizados: " + produto);
		
		sc.close();

	}

}
