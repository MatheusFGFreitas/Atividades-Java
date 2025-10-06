package program;

import java.util.Locale;
import java.util.Scanner;

public class EntradaDeDados {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);//para colocar o ponto flutuante em vez de virgula
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite um nome");
		String a;
		a = sc.next();//para ler string
		
		System.out.println("Digite um numero inteiro");
		int b;
		b = sc.nextInt();//para ler int
		
		System.out.println("Digite um numero com ponto");
		double c;
		c = sc.nextDouble();//para ler double
		
		System.out.println("Digite uma letra");
		char d;
		d = sc.next().charAt(0);//ler uma letra
		
		System.out.println("Dados digitados: ");
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
		
		System.out.println("Digite três frases que quiser");
		sc.nextLine();//limpeza de buffer para ler as proximas frases
		String s1, s2, s3;//para ler todas as palavras até a quebra de linha
		s1 = sc.nextLine();
		s2 = sc.nextLine();
		s3 = sc.nextLine();
		
		System.out.println("Frases digitadas:");
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		
		sc.close();
		
	}

}
