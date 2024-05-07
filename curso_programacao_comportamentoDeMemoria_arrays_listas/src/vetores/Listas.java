package vetores;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Listas {

	public static void main(String[] args) {
			// listas são estrutura de dados, sendo elas:
		//homogênea (dados do mesmo tipo)
		//Ordenada(elementos acessados por meio de posições
		//inicia vazia, e seus elementos são alocados sob demanda
		//Cada elemento ocupa um "nó" (ou nodo) da lista
		
			// Tipo (interface): list
			//classes que implementam: ArrayList, LinkedList, etc...
		
			//vantagens:
		//Tamanho variavel
		//facilidade de relaizar inserções e deleções
			//Desvantagems
		//acesso sequencial aos elementos (dependendo da implementação da lista, a navegação é otimizada)
		
		// aqui dá erro: List x = new List(); pois temos que utilizar arraylist etc...
		
		//demo que ira vir a seguir:
		
		//Tamanho da lista: size()
		//Inserir elemento na lista: add(obj), add(int, obj)
		//remover elementos da lista: remove(obj), remove(int),removeIf(predicate)
		//Encontrar posição de elemento: indexOf(obj), lastIndexOf(obj)
		//filtrar lista com base em predicado:
			//List<Interger> result = list.stream().filter(x -> x > 4).findFirst().orElse(null);
		
		//assuntos pendentes:
			//interfaces
			//generics
			//predicados(lambda)
		
		List<String> list = new ArrayList<>(); //Arraylist é o mais comum para instanciar a List
		
		list.add("Maria");//adicionando nomes a lista
		list.add("Alex");
		list.add("Bob");
		list.add("Anna");
		list.add(2, "Marco"); //sobrecarga para colocar o marco no local 2 sem prejudicar
		
		System.out.println(list.size());//para printar a quantidade de inserções na lista
		
		for (String x : list) {
			System.out.println(x);
		}

		System.out.println("-------------------------");
		//list.remove("Anna");//remove um dado a partir da comparação do enunciado
		//list.remove(1);//remove o que está no local 1
		list.removeIf(x -> x.charAt(0) == 'M'); //remove todos os nomes com o inicial M, feito em lambda
		
		for (String x : list) {
			System.out.println(x);
		}
		
		System.out.println("-------------------------");
		System.out.println("index of bob: " + list.indexOf("Bob"));//para procurar o numero onde o nome bob está na lista
		System.out.println("index of Marco " + list.indexOf("Marco"));//vai dar -1 se não estiver mais o nome na lista
		
		System.out.println("-------------------------");
		List<String> result = list.stream().filter(x -> x.charAt(0) == 'A').collect(Collectors.toList());//filtrando a lista so para quem começa com A
		//necessario declarar uma nova lista, com o comando para pegar a lista original, e filtrar, assim devolvendo somente os elementos desejados
		//temos que criar uma lista, converter para stream(assim pode utilizar operaçoes lambda) ai o filter colocara predicado, e ele irá devolver
		//um stream já filtrado, porém depois temos que converter ele novamente para lista com o collect.
		
		for (String x : result) {
			System.out.println(x);
		}
		
		System.out.println("-------------------------");
		String name = list.stream().filter(x -> x.charAt(0) == 'A').findFirst().orElse(null);//para encontrar o primeiro elemento que começa com A
		//se colocar outra letra que não contem na lista, volta nulo
		System.out.println(name);
		
	}

}
