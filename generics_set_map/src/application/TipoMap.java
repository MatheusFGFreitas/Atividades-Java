package application;


import java.util.Map;
import java.util.TreeMap;


public class TipoMap {

	public static void main(String[] args) {

		Map<String, String> cookies = new TreeMap<>();//ordenação em ordem alfabetica
		
		cookies.put("Username", "Maria");
		cookies.put("email", "Maria@gmail.com");
		cookies.put("phone", "997711228");
		
		cookies.remove("email");
		cookies.put("phone", "998877006");//esse valor vai sobreescrever o valor antigo
		
		System.out.println("Contains 'phone' key: " + cookies.containsKey("phone"));//para checar se tem ou nn
		System.out.println("Phone number: " + cookies.get("phone"));//traz o valor da chave
		System.out.println("Email: " + cookies.get("email"));//se o elemento n exisir, ele retorna nulo
		System.out.println("Size: " + cookies.size());
		
		System.out.println("All Cookies: ");
		for(String key : cookies.keySet()) {
			System.out.println(key + ": " + cookies.get(key));
		}
		

		
	}

}
