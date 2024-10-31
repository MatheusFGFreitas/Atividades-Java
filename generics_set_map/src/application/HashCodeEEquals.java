package application;

import entities.Client;

public class HashCodeEEquals {

	public static void main(String[] args) {
		
		String a1 = "Maria";
		String b1 = "Alex";
		
		System.out.println(a1.equals(b1));//o resultado dá falso pq o string A não é igual ao String B
		
		String a2 = "Maria";
		String b2 = "Alex";
		
		System.out.println(a2.hashCode());//hashcode é um codigo que gera um numero inteiro a partir dos dados da variavel
		System.out.println(b2.hashCode());//caso a variavel seja a mesma, o valor do codigo será igual, caso seja diferente, será diferente
		//porem é limitado a 32 bits, então pode dar um falso positivo, com uma chance minuscula
		//a diferença dos dois é que o equal é lento mas acerta 100%, enquanto hash é rapido mas tem uma pequena chance de dar colisão
		
		Client c1 = new Client("Maria", "maria@gmail.com");
		Client c2 = new Client("Alex", "alex@gmail.com");
		
		String s1 = "Test";
		String s2 = "Test";
		
		System.out.println(c1.hashCode());
		System.out.println(c2.hashCode());
		System.out.println(c1.equals(c2));
		
		System.out.println(c1 == c2);//mesmo se o conteudo do c1 e c2 for igual, a alocação de memoria é diferente, então dará falso sempre
		System.out.println(s1 == s2);//como o conteudo é literal, então dará positivo, pois há um tratamento especial nesse quesito
	}

}
