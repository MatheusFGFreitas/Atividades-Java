package vetores;

public class TesteBoxingUnboxing {

	public static void main(String[] args) {
			
		int x = 20;
		
		Object obj = x; //é alocado um objeto valendo 20, e o objeto irá apontar para lá
		
		System.out.println(obj);
		
		int y = (int) obj; //o processo contrario, pega o valor, e joga para uma variavel desejavel, o unboxing
		
		System.out.println(y);
	}

}
