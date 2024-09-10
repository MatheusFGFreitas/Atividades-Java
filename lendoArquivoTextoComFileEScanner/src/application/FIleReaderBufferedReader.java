package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FIleReaderBufferedReader {

	public static void main(String[] args) {
		
		String path = "C:\\Users\\CulleR\\OneDrive\\Área de Trabalho\\In.txt";
		FileReader fr = null;
		BufferedReader br = null;
		
		try {
			fr = new FileReader(path);//pode deixar tudo no mesmo local, instanciando no lugar do FR na linha de baixo
			br = new BufferedReader(fr);
			
			String line = br.readLine();
			
			while(line != null) {
				System.out.println(line);
				line = br.readLine();
				}
			
			}
		catch (IOException e) {
			System.out.println("erro: " + e.getMessage());
		}
		finally {
			try {
				if (br != null) {
					br.close();
				}
				if (fr != null) {
					fr.close();
				}
			}
			catch (IOException e){
				e.printStackTrace();
			}
		}
	}
}


