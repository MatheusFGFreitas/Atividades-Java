package application;

import java.io.File;
import java.util.Scanner;

public class InfoDoCaminhoDoArquivo {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("entre o caminho do arquivo: ");
		String strPath = sc.nextLine();
		
		File path = new File(strPath);
		
		System.out.println("getName: " + path.getName());//mostra apenas o nome do arquivo
		System.out.println("getParent: " + path.getParent());//mostra o nome do caminho da pasta onde está o arquivo
		System.out.println("getPath: " + path.getPath());//mostra o caminho e o nome do arquivo
		
		
		sc.close();

	}

}
