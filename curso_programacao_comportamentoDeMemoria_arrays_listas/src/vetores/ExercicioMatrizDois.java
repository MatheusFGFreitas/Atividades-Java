package vetores;

import java.util.Scanner;

public class ExercicioMatrizDois {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("digite a quantidade de linhas e colunas respectivamente da matriz:");//criação das posições na matriz
		
		int m = sc.nextInt();
		int n = sc.nextInt();
		
		int[][] mat = new int[m][n];
		
		System.out.println("Digite os numeros presentes na matriz criada: ");
		
		for(int i=0; i<m; i++) {//comando para a colocação de numeros na matriz
			for(int j=0; j<n; j++) {
				mat[i][j] = sc.nextInt();
			}
		}
		System.out.println();
		
		System.out.println("a seguir está a matriz digitada: ");//a partir daqui sera mostrada a matriz
		for(int i=0; i<m; i++) {
			System.out.println();
			for(int j=0; j<n; j++) {
				System.out.printf(mat[i][j] + "  ");
			}
		}
		System.out.println();
		System.out.println();
		
		System.out.print("digite o numero desejado para pesquisa: ");
		int valor = sc.nextInt();
		System.out.println();
		System.out.println("o valor desejado para as posições é: " + valor);
		System.out.println();
		
		for(int i = 0; i<mat.length; i++) {
			for(int j = 0; j<mat[i].length; j++) {
				if(mat[i][j] == valor) {
					System.out.printf("%nPosição (%d, %d): ", i, j);
					System.out.println();
					if(j > 0) {//if para puxar o numero a esquerda
						System.out.printf("Esquerda: %d%n", mat[i][j-1]);
					}
					if(j < n - 1) {//if para puxar o numero a direita
						System.out.printf("Direita: %d%n", mat[i][j+1]);
					}
					if(i > 0) {//if para puxar o numero acima
						System.out.printf("Acima: %d%n", mat[i - 1][j]);
					}
					if(i < m - 1) {// if para puxar o numero abaixo
						System.out.printf("Abaixo: %d%n", mat[i+1][j]);
					}
				}
			}
		}
		
		
		
		
		
		
		sc.close();

	}

}
