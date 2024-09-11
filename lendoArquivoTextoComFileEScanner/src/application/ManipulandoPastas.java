package application;

import java.io.File;
import java.util.Scanner;

public class ManipulandoPastas {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o caminho da pasta: ");
		String strPath = sc.nextLine();//o usuario digita o caminho da pasta, criei uma pasta com 3 pastas vazias para o teste
		
		File path = new File (strPath);//o caminho da pasta é instanciado
		
		File[] folders = path.listFiles(File::isDirectory);//essa chamada ira criar um vetor com cada caminho das pastas
		
		System.out.println("Pastas: ");
		for(File folder : folders) {//criado um for para mostrar os caminhos da pasta na pasta escolhida
			System.out.println(folder);
		}
		
		File[] files = path.listFiles(File::isFile);//mesma coisa das pastas, porém com arquivos, mudado de lugar os arquivos in e out das aulas anteriores para a pasta de testes
		System.out.println("Arquivos: ");
		for (File file : files){
			System.out.println(file);
		}
		
		boolean success = new File(strPath + "\\04").mkdir();//para criar uma subpasta a partir desse comando
		System.out.println("Pasta criada com sucesso: " + success);
		
		sc.close();

	}

}
