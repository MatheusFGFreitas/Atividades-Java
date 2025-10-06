package program;

public class ProcessamentoDeDadosCasting {

	public static void main(String[] args) {
		
		int x;
		double y;
		
		x = 5;
		y = 2 * x;
		
		System.out.println(x);
		System.out.println(y);
		
		double a, b, c, area;
		
		a = 6.0;
		b = 8.0;
		c = 5.0;
		
		area = (a + b) / 2.0 * c;//atribuindo na conta para encontrar a area
		
		System.out.println(area);
		
		int d, e;
		double resultado;
		
		d = 5;
		e = 2;
		
		resultado = (double)d / e;//feito casting para forçar a sair as casas decimais
		
		System.out.println(resultado);
		
		double f;
		int g;
		
		f = 5.0;
		g = (int)f;//feito o casting pra forçar a ida sem a casa decimal
		
		System.out.println(g);

	}

}
