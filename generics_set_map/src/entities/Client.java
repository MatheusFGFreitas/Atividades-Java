package entities;

import java.util.Objects;

public class Client {
	
	private String name;
	private String email;
	
	public Client(String name, String email) {
		this.name = name;
		this.email = email;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	//criado com nome e email
	@Override
	public int hashCode() {
		return Objects.hash(email, name);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Client other = (Client) obj;
		return Objects.equals(email, other.email) && Objects.equals(name, other.name);
	}

	
	//criado um source generate hashcode equals pelo eclipse, que é o basico só para o nome
	//@Override
	//public int hashCode() {
		//return Objects.hash(name);
	//}

	//@Override
	//public boolean equals(Object obj) {//ele faz no argumento object, não generics
		//if (this == obj)//referncia igual volta verdadeiro
		//	return true;
		//if (obj == null)//se for nulo, retorna falso
		//	return false;
		//if (getClass() != obj.getClass())//se n tiver a mesma classe, volta false
		//	return false;
		//Client other = (Client) obj;//da o cast do client pra object
		//return Objects.equals(name, other.name);//e ve se é igual
	
	
	
	
}
