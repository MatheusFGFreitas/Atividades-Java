package application;

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

	}

}
