/*
 *	Disciplina: Programação Orientada a Objetos 
 *  Professor: 	Orlewilson B. Maia
 *  Turma:		Análise e Desenvolvimento de Sistemas, 
 *  			Gestão da TI e Segurança da Informação
 *  Data:		23/10/17
 *  Autor:		Orlewilson B. Maia
 *  Descrição:	Modelo para representar dados de um 
 *  			professor
 */

// extends = herança
public class Professor extends Pessoa{

	// atributos
	private String escolaridade;

	// construtor sem argumento
	public Professor() {
		
		// primeira forma
		//this.setNome("");
		//this.setIdade(0);
		
		// segunda forma
		// public Pessoa()
		//super();
		
		// terceira forma
		// public Pessoa(String nome, int idade)
		super("", 0);
		
		this.escolaridade = "";
	}

	// construtor com argumento
	public Professor(String nome, int idade,
			String escolaridade) {
		
		// primeira forma
		//setNome(nome);
		//setIdade(idade);
		
		// segunda forma
		// public Pessoa(String nome, int idade)
		super(nome, idade);
			
		this.escolaridade = escolaridade;
	}

	// métodos
	public void setEscolaridade(String escolaridade) {
		this.escolaridade = escolaridade;
	}

	public String getEscolaridade() {
		return this.escolaridade;
	}
	
	// Mostrar informações sobre o Professor
	public void mostrarDados() {
		
		// primeira forma
//		System.out.println("Nome: " + getNome());
//		System.out.println("Idade: " + getIdade());
		
		// segunda forma
//		super.mostrarDados();
		
		System.out.println("Nome: " + getNome());
		
		System.out.println("Escolaridade: " + 
				getEscolaridade());
		
		System.out.println("Idade: " + getIdade());

		
	}
}






