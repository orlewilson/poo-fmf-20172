/*
 *	Disciplina: Programação Orientada a Objetos 
 *  Professor: 	Orlewilson B. Maia
 *  Turma:		Análise e Desenvolvimento de Sistemas, Gestão da TI 
 *  			e Segurança da Informação
 *  Data:		29/08/17
 *  Autor:		Orlewilson B. Maia
 *  Descrição:	Modelo para representar o modelo de um dragão
 * 	
 */

public class Dragao {

	// Atributos (sem encapsulamento)
	// String nome;
	// String cor;
	// String especie;
	// int tamanho;
	// int peso;

	// Atributos (com encapsulamento)
	private String nome;
	private String cor;
	private String especie;
	private int tamanho;
	private int peso;

	// Construtor sem argumentos
	public Dragao() {
		this.nome = "";
		this.cor = "";
		this.especie = "";
		this.tamanho = 0;
		this.peso = 0;
	}

	// Construtor com argumentos
	public Dragao(String nome, String cor, String especie, int tamanho, int peso) {
		this.nome = nome;
		this.cor = cor;
		this.especie = especie;
		this.tamanho = tamanho;
		this.peso = peso;
	}

	// Métodos para garantir o encapsulamento dos atributos
	public String getNome() {
		return this.nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCor() {
		return this.cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public String getEspecie() {
		return this.especie;
	}

	public void setEspecie(String especie) {
		this.especie = especie;
	}

	public int getTamanho() {
		return this.tamanho;
	}

	public void setTamanho(int tamanho) {
		this.tamanho = tamanho;
	}

	public int getPeso() {
		return this.peso;
	}

	public void setPeso(int peso) {
		this.peso = peso;
	}
}
