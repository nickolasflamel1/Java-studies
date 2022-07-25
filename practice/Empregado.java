
public class Empregado {
	
	String nome;
	int idade;
	String cargo;
	
	public Empregado(String nome, int idade, String profissao) {
		this.nome = nome;
		this.idade = idade;
		this.cargo = profissao;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public String getProfissao() {
		return cargo;
	}

	public void setProfissao(String profissao) {
		this.cargo = profissao;
	}
	
	
	
	
	
}
