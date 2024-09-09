package application;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Arquivo {

	public static void main(String[] args) {
		
		File file = new File("C:\\Users\\CulleR\\OneDrive\\Área de Trabalho\\In.txt");//instanciado um arquivo com o caminho completo de onde está o arquivo
		Scanner sc = null;//scanner entrando como nulo
		try {//para abrir o arquivo, é uma boa pratica colocar em bloco try catch
			sc = new Scanner(file);//colocado o arquivo no scanner
			while (sc.hasNextLine()) {//enquanto existir uma nova linha no arquivo
				System.out.println(sc.nextLine());//é lido a nova linha do arquivo
			}
		}
		catch (IOException e) {//catch para caso aconteça algum erro
			System.out.println("erro : " + e.getMessage());//é imprimido na tela a mensagem do erro
		}
		finally {//é uma boa pratica colocar pra fechar o scanner no bloco finally, pois independente de onde pare o programa, ele ira fechar
			if(sc != null) {//se o sc for diferente de nulo
				sc.close();//fechamos ele, pois se for nulo, não precisa fechar
			}
		}
	}

}
