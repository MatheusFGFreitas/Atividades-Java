package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.time.Instant;
import java.util.Date;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

import entities.LogEntry;

public class Exercicio1Set {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Entre com o caminho do arquivo: ");
		String path = sc.nextLine();
		
		try(BufferedReader br = new BufferedReader(new FileReader(path))) {
			
			Set<LogEntry> set = new HashSet<>();//hashset escolhido pq é o mais rapido, e n precisa de ordem, apenas contar os usuarios unicos
			
			String line = br.readLine();//fazendo o leitor ler a linha ate o fim, enquanto tiver caractere, ele lê
			while (line != null) {//enquanto ainda houver linha
				
				String[] fields = line.split(" ");//separando os dados do arquivo com base em espaço em branco
				String username = fields[0];//o primeiro espaço é armazenado como username
				Date moment = Date.from(Instant.parse(fields[1]));//instanciado a data e horario com o codigo date.from
				
				set.add(new LogEntry(username, moment));//criado o argumento para inserir no set, se algum argumento entrar com o nome repetido, será barrado
				
				line = br.readLine();
			}
			System.out.println("Total de usuarios: " + set.size());
		}
		
		catch (IOException e) {
			System.out.println("Erro: " + e.getMessage());
		}
		sc.close();
		
	}

}
