package application;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class TipoSet {

	public static void main(String[] args) {

		Set<String> set = new HashSet<>();
		//HashSet é o metodo mais rapido, porém não tem ordem alguma, vai de qualquer jeito
		set.add("TV");
		set.add("Notebook");
		set.add("Tablet");
		
		System.out.println(set.contains("Notebook"));
		
		for (String p : set) {
			System.out.println(p);
		}
		
		Set<String> set2 = new TreeSet<>();
		//TreeSet é o metodo mais lento, porém ordena em ordem alfabetica e em ordem de letra maiuscula, por exemplo, TV ta na frente do tablet pq o V está em maiusculo
		set2.add("TV");
		set2.add("Notebook");
		set2.add("Tablet");
		
		System.out.println(set2.contains("Notebook"));
		
		for (String p : set2) {
			System.out.println(p);
		}
		
		Set<String> set3 = new LinkedHashSet<>();
		//HashSet é o metodo de velocidade intermediario, tem a velocidade entre os dois, e mantem a ordem de inserção
		set3.add("TV");
		set3.add("Notebook");
		set3.add("Tablet");
		
		System.out.println(set3.contains("Notebook"));
		
		for (String p : set3) {
			System.out.println(p);
		}
		
		//set.remove ira remover o que digitar, por exemplo Set.remove("Tablet");
		//set.removeIf irá remover apenas os objetos que satisfazerem algo que vc digitar, por exemplo, para removermos palavras com mais de 3
		//digitos, o codigo ficaria set.removeIf(x -> x.length() >= 3); ou para remover todos com a letra T, seria: set.removeIf(x -> x.charAt(0) == 'T');
		

	}

}
