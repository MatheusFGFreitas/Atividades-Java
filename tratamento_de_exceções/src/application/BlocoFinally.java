package application;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class BlocoFinally {
	
	public static void main(String[] args) {
		
		File file = new File("C:\\teste\\in.txt");//para abrir um arquivo no pc
		Scanner sc = null;
		try {
			sc = new Scanner(file);
			while (sc.hasNextLine()) {
				System.out.println(sc.nextLine());
			}
		} catch (IOException e) {
			System.out.println("Erro ao abrir arquivo: " + e.getMessage());//caso de erro, é isso
		} finally {
			if (sc != null) {//finaly vai ser executado independente se der certo ou errado o comando no try catch
				sc.close();
			}
			System.out.println("bloco final executado");
		}
	}
}