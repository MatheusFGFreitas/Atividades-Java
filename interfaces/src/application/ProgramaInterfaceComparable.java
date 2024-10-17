package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ProgramaInterfaceComparable {
	public static void main(String[] args) {
		
		List<String> list = new ArrayList<>();//instanciado lista de string
		String path = "C:\\temp\\in.txt";//caminho do arquivo que será lido
		
		try (BufferedReader br = new BufferedReader(new FileReader(path))) {//instanciado bufferd reader
			
			String name = br.readLine();//leu linha
			
			while (name != null) {//enquanto for diferente de nulo
				list.add(name);//adiciona na lista
				name = br.readLine();//depois proxima linha
			}
			
			Collections.sort(list);//chamada operação collections para ordenar a coleção
			
			for (String s : list) {//percorrendo a lista
				System.out.println(s);//imprimindo os elementos
			}
		} 
		catch (IOException e) {
			System.out.println("Error: " + e.getMessage());
		}
	}
}