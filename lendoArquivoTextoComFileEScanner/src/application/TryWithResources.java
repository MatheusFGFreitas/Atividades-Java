package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class TryWithResources {

	public static void main(String[] args) {

		String path = "C:\\Users\\CulleR\\OneDrive\\Área de Trabalho\\In.txt";//caminho para o codigo
		
		try (BufferedReader br = new BufferedReader(new FileReader(path))){//feito esse instansiamento direto no bloco try, para deixar o codigo mais limpo, sem precisar do bloco finally e precisar de uma variavel para fechar depois, tudo em uma linha só
			
			String line = br.readLine();
			
			while(line != null) {
				System.out.println(line);
				line = br.readLine();
				}
			
			}
		catch (IOException e) {
			System.out.println("erro: " + e.getMessage());
		}
	}
}

