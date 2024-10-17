package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import model.entities.Employee;

public class ProgramaInterfaceComparable {
	public static void main(String[] args) {
		
		List<Employee> list = new ArrayList<>();//instanciado lista de string
		String path = "C:\\temp\\in.txt";//caminho do arquivo que será lido
		
		try (BufferedReader br = new BufferedReader(new FileReader(path))) {//instanciado bufferd reader
			
			String employeeCsv = br.readLine();//leu linha
			
			while (employeeCsv != null) {//enquanto for diferente de nulo
				String[] fields = employeeCsv.split(",");//criado um vetor de string dividindo posições no , o que for antes do , é uma posição e depois do , é outra
				list.add(new Employee(fields[0], Double.parseDouble(fields[1])));//adiciona na lista dividindo o que precisa ser dividido, fields posição 0, e pegando o valor e transformando em Double na posição 1
				employeeCsv = br.readLine();//depois proxima linha
			}
			
			Collections.sort(list);//chamada operação collections para ordenar a coleção
			
			for (Employee emp : list) {//percorrendo a lista
				System.out.println(emp.getName() + "," + emp.getSalary());//imprimindo os elementos, agora com a separação graças ao compare to
			}
		} 
		catch (IOException e) {
			System.out.println("Error: " + e.getMessage());
		}
	}
}