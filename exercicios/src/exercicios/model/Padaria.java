package exercicios.model;

public class Padaria {
	private int quantidadePaes;
	private int quantidadeSonhos;
	private int quantidadeLeite;

	public Padaria(int quantidadePaes, int quantidadeSonhos, int quantidadeLeite) {
		this.quantidadePaes = quantidadePaes;
		this.quantidadeSonhos = quantidadeSonhos;
		this.quantidadeLeite = quantidadeLeite;
	}

	public int getQuantidadePaes() {
		return quantidadePaes;
	}

	public int getQuantidadeSonhos() {
		return quantidadeSonhos;
	}

	public int getQuantidadeLeite() {
		return quantidadeLeite;
	}

	public void setQuantidadePaes(int quantidadePaes) {
		this.quantidadePaes = quantidadePaes;
	}

	public void setQuantidadeSonhos(int quantidadeSonhos) {
		this.quantidadeSonhos = quantidadeSonhos;
	}

	public void setQuantidadeLeite(int quantidadeLeite) {
		this.quantidadeLeite = quantidadeLeite;
	}

	public void verificarMaiorQuantidade() {
		if (quantidadePaes > quantidadeSonhos) {
			System.out.println("Pães estão em maior quantidade.");
		} else if (quantidadeSonhos > quantidadePaes) {
			System.out.println("Sonhos estão em maior quantidade.");
		} else {
			System.out.println("Pães e sonhos estão em mesma quantidade.");
		}
	}

}
