/*
 *	Disciplina: Programação Orientada a Objetos 
 *  Professor: 	Orlewilson B. Maia
 *  Turma:		Análise e Desenvolvimento de Sistemas, 
 *  			Gestão da TI e Segurança da Informação
 *  Data:		23/10/17
 *  Autor:		Orlewilson B. Maia
 *  Descrição:	Modelo para representar dados de uma 
 *  			pessoa
 */

// abstract = não cria objeto a partir dela
public abstract class Pessoa {
	
	// atributos
	private String nome;
	private int idade;

	// construtor sem argumento
	public Pessoa() {
		this.nome = "";
		this.idade = 0;
	}

	// construtor com argumento
	public Pessoa(String nome, int idade) {
		this.nome = nome;
		this.idade = idade;
	}

	// métodos
	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getNome() {
		return this.nome;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public int getIdade() {
		return this.idade;
	}

	
	// Mostrar informações sobre a Pessoa
	public void mostrarDados() {
		System.out.println("Nome: " + getNome());
		System.out.println("Idade: " + getIdade());
	}


	
	
}





