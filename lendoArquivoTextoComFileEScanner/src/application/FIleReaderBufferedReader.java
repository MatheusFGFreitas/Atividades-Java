package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FIleReaderBufferedReader {

	public static void main(String[] args) {
		
		String path = "C:\\Users\\CulleR\\OneDrive\\Área de Trabalho\\In.txt";//caminho para o codigo
		FileReader fr = null;//criado o file reader no nullo, igual buffered reader
		BufferedReader br = null;
		
		try {//filereader recebendo o caminho do arquivo
			fr = new FileReader(path);//pode deixar tudo no mesmo local, instanciando no lugar do FR na linha de baixo
			br = new BufferedReader(fr);
			
			String line = br.readLine();//se chegar no final, trará nulo
			
			while(line != null) {//enquanto for diferente de nulo
				System.out.println(line);//ira printar a linha
				line = br.readLine();//e ira para a outra linha
				}
			
			}
		catch (IOException e) {//catch para tratar o erro
			System.out.println("erro: " + e.getMessage());
		}
		finally {//agora pra fechar o br e o fr
			try {
				if (br != null) {//se o br for diferente de nulo, nós fechamos ele
					br.close();
				}
				if (fr != null) {//mesma coisa no fr
					fr.close();
				}
			}
			catch (IOException e){//e trata o erro caso de erro
				e.printStackTrace();
			}
		}
	}
}


