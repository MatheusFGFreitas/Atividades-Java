package application;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriter_e_BufferedWriter {

	public static void main(String[] args) {

		String[] lines = new String[] {"Bom dia", "Boa tarde", "Boa noite"};//feito um vetor para conter os cumprimentos.
		
		String path = "C:\\Users\\CulleR\\\\OneDrive\\Área de Trabalho\\Out.txt";//colocado o caminho para criar o arquivo
		
		try (BufferedWriter bw = new BufferedWriter(new FileWriter(path))){//criado o buffered e o filewriter, se colocar desse jeito: "path, true", o arquivo não é recriado, e sim atualizado com as novas inserções
			for (String line : lines) {
				bw.write(line);
				bw.newLine();
			}
		}
		catch (IOException e) {
			e.printStackTrace();
		}
	}

}
