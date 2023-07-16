package curso_porgramacao_estrutura_sequencial;

import java.util.Locale;

public class Int {

	public static void main(String[] args) {
		
		int y = 32; //valor da variavel y inteiro
		double x = 10.35784; //valor da variavel x com ponto flutuante A.K.A. valor quebrado
		
		System.out.println(y); //saida de dados y com quebra de linha
		System.out.printf("%.2f%n", x); //graças ao %.2f delimita a quantidade de casas decimais, enquanto %n é a quebra de linha
		System.out.printf("%.4f%n", x); //graças ao $.4f delimita a quantidade de casas decimais, enquanto %n é a quebra de linha
		
		Locale.setDefault(Locale.US); //graças a esse comando, em vez de , para decimais, vai ser .

		System.out.printf("%.4f%n", x); //como foi depois do locale, virá com ponto em vez de virgula
		
		System.out.println("RESULTADO = " + x + " Metros"); //desse jeito, irá sair no programa tanto o valor quanto o complemento de resultado e metros
		
		System.out.printf("RESULTADO = %.2f Metros%n", x); //graças a isso, ele irá sair apenas com 2 casas decimais
		
		String nome = "Maria";
		int idade = 31;
		double renda = 4000.0;
		System.out.printf("%s tem %d anos e ganha R$ %.2f reais%n", nome, idade, renda); //graças aos marcadores, irá sair o nome idade e renda em uma linha só
		
	}

}
