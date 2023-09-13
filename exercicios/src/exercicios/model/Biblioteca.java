package exercicios.model;

import java.util.Scanner;

public class Biblioteca {
	private String tituloLivro;
	private String autorLivro;
	private int anoPublicacao;
	private int numPaginas;

	// Construtor
	public Biblioteca() {
		// O construtor vazio é opcional, você pode removê-lo ou personalizá-lo conforme
		// necessário.
	}

	// Métodos get

	public String getTituloLivro() {
		return tituloLivro;
	}

	public String getAutorLivro() {
		return autorLivro;
	}

	public int getAnoPublicacao() {
		return anoPublicacao;
	}

	public int getNumPaginas() {
		return numPaginas;
	}

	// Métodos set

	public void setTituloLivro(String tituloLivro) {
		this.tituloLivro = tituloLivro;
	}

	public void setAutorLivro(String autorLivro) {
		this.autorLivro = autorLivro;
	}

	public void setAnoPublicacao(int anoPublicacao) {
		this.anoPublicacao = anoPublicacao;
	}

	public void setNumPaginas(int numPaginas) {
		this.numPaginas = numPaginas;
	}

	public void imprimirDados() {
		System.out.println("\nInformações do Livro na Biblioteca:");
		System.out.println("Título: " + getTituloLivro());
		System.out.println("Autor: " + getAutorLivro());
		System.out.println("Ano de Publicação: " + getAnoPublicacao());
		System.out.println("Número de Páginas: " + getNumPaginas());
		System.out.println("---------------------------");
		System.out.println();
	}
}
