package Entities;

public class Aluno {

	public String nome;
	public double nota1;
	public double nota2;
	public double nota3;
	public double fNota;
	
	public double notaFinal() {
		double nFinal = nota1 + nota2 + nota3;
		return nFinal;
	}

}
