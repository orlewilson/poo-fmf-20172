/*
 *	Disciplina: Programação Orientada a Objetos 
 *  Professor: 	Orlewilson B. Maia
 *  Turma:		Análise e Desenvolvimento de Sistemas, Gestão da TI 
 *  			e Segurança da Informação
 *  Data:		29/08/17
 *  Autor:		Orlewilson B. Maia
 *  Descrição:	Modelo para representar o modelo de uma faculdade
 * 	
 */

public class Faculdade {

	// Atributos (sem encapsulamento)
	// String nome;
	// String campus;
	// String cursos;
	// int qtdProfessores;
	// int qtdAlunos;
	// int qtdSalas;
	// String endereco;
	// String contato;
	// String paginaWeb;

	// Atributos (com encapsulamento)
	private String nome;
	private String campus;
	private String cursos;
	private int qtdProfessores;
	private int qtdAlunos;
	private int qtdSalas;
	private String endereco;
	private String contato;
	private String paginaWeb;

	// Construtor sem argumento
	public Faculdade() {
		this.nome = "";
		this.campus = "";
		this.cursos = "";
		this.qtdProfessores = 0;
		this.qtdAlunos = 0;
		this.qtdSalas = 0;
		this.endereco = "";
		this.contato = "";
		this.paginaWeb = "";
	}

	// Construtor com argumento
	public Faculdade(String nome, String campus, String cursos, int qtdProfessores, int qtdAlunos, int qtdSalas,
			String endereco, String contato, String paginaWeb) {
		this.nome = nome;
		this.campus = campus;
		this.cursos = cursos;
		this.qtdProfessores = qtdProfessores;
		this.qtdAlunos = qtdAlunos;
		this.qtdSalas = qtdSalas;
		this.endereco = endereco;
		this.contato = contato;
		this.paginaWeb = paginaWeb;
	}

	// Métodos para garantir o encapsulamento dos atributos

	public String getNome() {
		return this.nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCampus() {
		return this.campus;
	}

	public void setCampus(String campus) {
		this.campus = campus;
	}

	public String getCursos() {
		return this.cursos;
	}

	public void setCursos(String cursos) {
		this.cursos = cursos;
	}

	public int getQtdProfessores() {
		return this.qtdProfessores;
	}

	public void setQtdProfessores(int qtdProfessores) {
		this.qtdProfessores = qtdProfessores;
	}

	public int getQtdAlunos() {
		return this.qtdAlunos;
	}

	public void setQtdAlunos(int qtdAlunos) {
		this.qtdAlunos = qtdAlunos;
	}

	public int getQtdSalas() {
		return this.qtdSalas;
	}

	public void setQtdSalas(int qtdSalas) {
		this.qtdSalas = qtdSalas;
	}

	public String getEndereco() {
		return this.endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getContato() {
		return this.contato;
	}

	public void setContato(String contato) {
		this.contato = contato;
	}

	public String getPaginaWeb() {
		return this.paginaWeb;
	}

	public void setPaginaWeb(String paginaWeb) {
		this.paginaWeb = paginaWeb;
	}
}