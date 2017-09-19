/*
 *	Disciplina: Programação Orientada a Objetos 
 *  Professor: 	Orlewilson B. Maia
 *  Turma:		Análise e Desenvolvimento de Sistemas, Gestão da TI 
 *  			e Segurança da Informação
 *  Data:		29/08/17
 *  Autor:		Orlewilson B. Maia
 *  Descrição:	Executar o projeto
 * 	
 */

public class Principal {

	// executar o projeto
	public static void main(String[] args) {

		// Exemplo de objeto para a classe Dragao

		// criando objeto (com construtor sem argumentos)
		// Dragao bic = new Dragao();

		// criando objeto (com construtor com argumentos)
		Dragao smaug = new Dragao("smaug", "vermelho", "mágica", 100, 1000);

		// Atribuindo valores (sem encapsulamento)
		// smaug.nome = "smaug";
		// smaug.cor = "vermelho";
		// smaug.especie = "mágica";
		// smaug.tamanho = 100;
		// smaug.peso = 1000;

		// Atribuindo valores (com encapsulamento)
		smaug.setNome("smaug");
		smaug.setCor("vermelho");
		smaug.setEspecie("mágica");
		smaug.setTamanho(100);
		smaug.setPeso(1000);

		// Imprimir conteúdos (sem encapsulamento)
		// System.out.println("Nome: " + smaug.nome);
		// System.out.println("cor: " + smaug.cor);
		// System.out.println("Espécie: " + smaug.especie);
		// System.out.println("Tamanho: " + smaug.tamanho);
		// System.out.println("Peso: " + smaug.peso);

		// Imprimir conteúdos (com encapsulamento)
		System.out.println("Nome: " + smaug.getNome());
		System.out.println("cor: " + smaug.getCor());
		System.out.println("Espécie: " + smaug.getEspecie());
		System.out.println("Tamanho: " + smaug.getTamanho());
		System.out.println("Peso: " + smaug.getPeso());

		// Exemplo de objeto para a classe Faculdade

		// criando objeto (com construtor sem argumentos)
		// Faculdade fmf = new Faculdade();

		// criando objeto (com construtor com argumentos)
		Faculdade fmf = new Faculdade("Martha Falcão", "Adrianópolis",
				"Direito, Design, GTI, ADS, Segurança Informação, Engenharia", 50, 5000, 60,
				"R. Natal, 300 - Adrianópolis, Manaus - AM, 69057-090", "4020-4900",
				"https://www.devrybrasil.edu.br/fmf");

		// Atribuindo valores (sem encapsulamento)
		// fmf.nome = "Martha Falcão";
		// fmf.campus = "Adrianópolis";
		// fmf.cursos = "Direito, Design, GTI, ADS, Segurança Informação, Engenharia";
		// fmf.qtdProfessores = 50;
		// fmf.qtdAlunos = 5000;
		// fmf.qtdSalas = 60;
		// fmf.endereco = "R. Natal, 300 - Adrianópolis, Manaus - AM, 69057-090";
		// fmf.contato = "4020-4900";
		// fmf.paginaWeb = "https://www.devrybrasil.edu.br/fmf";

		// Atribuindo valores (com encapsulamento)
		fmf.setNome("Martha Falcão");
		fmf.setCampus("Adrianópolis");
		fmf.setCursos("Direito, Design, GTI, ADS, Segurança Informação, Engenharia");
		fmf.setQtdProfessores(50);
		fmf.setQtdAlunos(5000);
		fmf.setQtdSalas(60);
		fmf.setEndereco("R. Natal, 300 - Adrianópolis, Manaus - AM, 69057-090");
		fmf.setContato("4020-4900");

		// Imprimir conteúdos (sem encapsulamento)
//		System.out.println("Nome: " + fmf.nome);
//		System.out.println("Campus: " + fmf.campus);
//		System.out.println("Cursos: " + fmf.cursos);
//		System.out.println("Qtd. Professores: " + fmf.qtdProfessores);
//		System.out.println("Qtd. Alunos: " + fmf.qtdAlunos);
//		System.out.println("Qtd. Salas: " + fmf.qtdSalas);
//		System.out.println("Endereço: " + fmf.endereco);
//		System.out.println("Contato: " + fmf.contato);

		// Imprimir conteúdos (com encapsulamento)
		System.out.println("Nome: " + fmf.getNome());
		System.out.println("Campus: " + fmf.getCampus());
		System.out.println("Cursos: " + fmf.getCursos());
		System.out.println("Qtd. Professores: " + fmf.getQtdProfessores());
		System.out.println("Qtd. Alunos: " + fmf.getQtdAlunos());
		System.out.println("Qtd. Salas: " + fmf.getQtdSalas());
		System.out.println("Endereço: " + fmf.getEndereco());
		System.out.println("Contato: " + fmf.getContato());
	}
}
