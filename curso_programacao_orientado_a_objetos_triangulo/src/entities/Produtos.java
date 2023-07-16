package entities;

public class Produtos {
	
	public String nome;
	public double preco;
	public int quantidade;
	
	public double valorTotalEmEstoque() {
		return preco * quantidade;
	}
	
	public void addProdutos(int quantidade) {
		this.quantidade += quantidade;
	}
	
	public void removerProdutos(int quantidade) {
		this.quantidade -= quantidade;
	}
	
	public String toString() { //to string é a função para impressão no programa
		return nome
			+ ", $ "
			+ String.format("%.2f", preco) //formatação para sair 2 casas decimais
			+ ", "
			+ quantidade
			+ " unidades, Total: $ "
			+ String.format("%.2f", valorTotalEmEstoque());
	}
}
