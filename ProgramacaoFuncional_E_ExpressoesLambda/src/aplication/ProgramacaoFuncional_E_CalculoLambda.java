package aplication;

import java.util.Arrays;

public class ProgramacaoFuncional_E_CalculoLambda {

	public static int globalValue = 3;//se diferenciar o valor, o comportamento vai ser diferente, ou seja, não tem transparencia referencial
	
	public static void main(String[] args) {//exemplo de função que não é referencialmente transparente

		int[] vect = new int[] { 3, 4, 5 };//criado um vetor com os numeros
		changeOddValues(vect);//criado função mude os valores impares
		System.out.println(Arrays.toString(vect));//depois imprime os valores
	}

	public static void changeOddValues(int[] numbers) {//pega o vetor
		for (int i = 0; i < numbers.length; i++) {//percorre
			if (numbers[i] % 2 != 0) {//se o vetor na posição I verificando se for impar
				numbers[i] += globalValue;//adiciona o global value nesse valor impar
			}
		}

	}

}
