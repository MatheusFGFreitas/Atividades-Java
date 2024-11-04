package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class ExercicioMap {

	public static void main(String[] args) {
		
		Map<String, Integer> votos = new HashMap<>();
		String caminhoArquivo = "A:\\ArquivosJava\\Votos.txt";
		
		try(BufferedReader br = new BufferedReader(new FileReader(caminhoArquivo))){
			String linha = br.readLine();
			
			while(linha != null) {
				//dividindo a linha em nome do candidato e votos usando ","
				String[] partes = linha.split(",");
				String candidato = partes[0].trim();//nome do candidato
				int votosUrna = Integer.parseInt(partes[1].trim());//votos
				
				//atualizando o numero de votos no Map
				votos.put(candidato, votos.getOrDefault(candidato, 0) + votosUrna);
				
				//proxima linha
				linha = br.readLine();
			}
		}
		catch(IOException e) {
			System.out.println("Erro ao ler arquivo: " + e.getMessage());
		}
		
		//resultado
		System.out.println("Resultado dos votos: ");
		for (Entry<String, Integer> entry : votos.entrySet()) {
			System.out.println(entry.getKey() + ": " +entry.getValue() + " votos");
		}
	}

}
