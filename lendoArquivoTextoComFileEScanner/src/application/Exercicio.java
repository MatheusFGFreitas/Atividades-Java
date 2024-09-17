package application;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Produto;

public class Exercicio {

	public static void main(String[] args) throws ParseException {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		List<Produto> list = new ArrayList<>();//criada lista para guardar a leitura dos produtos
		
		System.out.println("Entre com o caminho do arquivo: ");
		String sourceFileStr = sc.nextLine();//digitar o caminho para ler o arquivo desejado
		
		File sourceFile = new File(sourceFileStr);//instanciando o caminho digitado para o File
		String sourceFolderStr = sourceFile.getParent();//pega o caminho de onde está o documento, para obter o caminho para mostrar na tela
		
		boolean success = new File(sourceFolderStr + "\\out").mkdir();//criado um booleano para criar um novo diretorio, que ao encontrar o arquivo, é criado uma pasta out no local do arquivo lido
		
		String targetFileStr = sourceFolderStr + "\\out\\summary.csv";//criado o summary.csv na pasta recem criada
		
		try(BufferedReader br = new BufferedReader(new FileReader(sourceFileStr))){//vai tentar ler o source file, se ele ler, entra no try, se falhar, entra no catch
			
			String itemCsv = br.readLine();//BufferedReader lendo a linha e transformando numa string
			while (itemCsv != null) {//enquanto não chegar ao ponto em que a proxima linha esteja em branco
				
				String[] fields = itemCsv.split(",");//cria uma string com o nome, preço e quantidade
				String name = fields[0];
				double price = Double.parseDouble(fields[1]);
				int quantity = Integer.parseInt(fields[2]);
				
				list.add(new Produto(name, price, quantity));//e adiciona na lista
				
				itemCsv = br.readLine();//então repete a leitura de linha
				
			}
			
			try(BufferedWriter bw = new BufferedWriter(new FileWriter(targetFileStr))){//criado o BufferedWriter para escrever no arquivo de saida
				
				for(Produto item: list) {//criado um laço de repetição
					bw.write(item.getName() + "," + String.format("%.2f", item.total()));//que coloca todos os itens no arquivo novo
					bw.newLine();
				}
				System.out.println(targetFileStr + "Created");//mostrado no fim que o arquivo de saida foi criado
			}
			catch (IOException e){//caso de erro, o erro é tratado
				System.out.println("Erro no arquivo: " + e.getMessage());
			}
			
		}
		catch(IOException e) {
			System.out.println("Erro no arquivo" + e.getMessage());
		}
		
		sc.close();

	}

}
