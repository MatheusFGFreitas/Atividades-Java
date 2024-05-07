package vetores;

import java.util.Scanner;

public class ExercicioMatriz {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int[][] mat = new int[n][n];//criação da matriz, contendo apenas um numero, por exemplo, se inserido o numero 3, a matriz criada é 3x3
		
		for (int i=0; i<n; i++) {//leitura da matriz, o 1 for é do primeiro numero da posição
			for (int j=0; j<n; j++) {//segundo numero da posição, chegando no maximo, ele volta pro for de cima
				mat[i][j] = sc.nextInt();
			}
		}
		
		System.out.println("Diagonal Principal: ");
		
		for(int i=0; i<n; i++) {
			System.out.print(mat [i][i] + "  ");//for para imprimir na tela os numeros em diagonal da matriz criada
		}
		System.out.println();//quebra de linha
		
		int contagem = 0;
		
		//laço de repetição para contagem de quantidade de numeros negativos na matriz
		for(int i=0; i<n; i++) {
			for(int j=0; j<n; j++) {
				if(mat[i][j] < 0) {
					contagem++;
				}
			}
		}
		
		System.out.println("Quantidade de números negativos: " + contagem);
		
		sc.close();
		
	}

}
