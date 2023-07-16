package curso_porgramacao_estrutura_sequencial;

public class ProcessamentoCasting6 {

	public static void main(String[] args) {

		double a;
		int b;
		
		a = 5.0;
		b = (int) a; //avisa ao compilador para não se importar com a perca de informação, transforma o numero quebrado para inteiro
		
		System.out.println(b);
	}

}
