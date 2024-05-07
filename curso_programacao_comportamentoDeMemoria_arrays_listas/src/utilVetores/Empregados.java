package utilVetores;

public class Empregados {

	private Integer id;
	private String nome;
	private Double salario;
	
	public Empregados() {
	}

	public Empregados(Integer id, String nome, Double salario) {
		super();
		this.id = id;
		this.nome = nome;
		this.salario = salario;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Double getSalario() {
		return salario;
	}

	public void setSalario(Double salario) {
		this.salario = salario;
	}
	
	public void aumentoSalario(double porcentagem) { // formula para aumento de salario com base em porcentagem
		salario = salario + salario * porcentagem / 100.0;
	}
	
	public String toString() { // comando criado para retornar ID, Nome e Salario no programa
		return id + ", " + nome + ", " + String.format("%.2f", salario);
	}
}	
