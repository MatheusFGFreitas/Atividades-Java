package vetores;

public class LacoForEach {

	public static void main(String[] args) {

		String[] vect = new String[] {"maria", "bob", "alex"};
		
		for (int i=0; i<vect.length; i++) {
			System.out.println(vect[i]);
		}
		System.out.println("--------------------");//para separar os sysout
		for (String obj : vect) { //estilo do vetor(String) Apelido : Nome do vetor
			System.out.println(obj);//esse for percorre todos os elementos do vect chamando os de obj
		}

	}

}
