package Program;

public class FuncoesString {

	public static void main(String[] args) {
		
		String original = "abcde FGHIJ ABC abc DEFG ";
		
		String s01 = original.toLowerCase();//convertendo pra minusculo
		String s02 = original.toUpperCase();//convertendo pra maiusculo
		String s03 = original.trim();//mantem a mesma string, porem vai eliminar os espaços em branco ao redor da string
		String s04 = original.substring(2);//pegando apenas o caractere da posição 2 em diante
		String s05 = original.substring(2, 9);//pegando o caractere da posição 2 ao 9
		String s06 = original.replace('a', 'x');//replace troca tudo de 'a' que encontrar, por 'x', porém apenas o valor exato, não troca A maiusculo por exemplo, se o caractere inserido for o 'a'
		String s07 = original.replace("abc", "xy");//troca o substring inteiro, tem que ser especificamente 'abc'
		
		int i = original.indexOf("bc");//a 1 ocorrencia do 'bc' será o valor da string, como esse exemplo, será 1
		int j = original.lastIndexOf("bc");//será a ultima ocorrencia onde acontece o 'bc', que seria 17
		
		System.out.println("Original: -" + original + "-");
		System.out.println("toLowerCase: -" + s01 + "-");
		System.out.println("toUpperCase: -" + s02 + "-");
		System.out.println("trim: -" + s03 + "-");
		System.out.println("substring(2): -" + s04 + "-");
		System.out.println("substring(2, 9): -" + s05 + "-");
		System.out.println("replace('a', 'x'): -" + s06 + "-");
		System.out.println("replace('abc', 'xy'): -" + s07 + "-");
		System.out.println("Index of 'bc': " + i);
		System.out.println("Last index of 'bc': " + j);
		
		String s = "potato apple lemon";
		
		String[] vect = s.split(" ");//split separa com o valor para separar, nesse exemplo é o espaço 
		
		String word1 = vect[0];//aqui eles irão guardar os valores separados em vetores
		String word2 = vect[1];
		String word3 = vect[2];

	}

}
