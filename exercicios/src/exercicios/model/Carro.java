package exercicios.model;

public class Carro {
	private String marca;
	private String modelo;
	private int ano;
	private String cor;

	public Carro(String marca, String modelo, int ano, String cor) {
		this.marca = marca;
		this.modelo = modelo;
		this.ano = ano;
		this.cor = cor;
	}

	public String getMarca() {
		return marca;
	}

	public String getModelo() {
		return modelo;
	}

	public int getAno() {
		return ano;
	}

	public String getCor() {
		return cor;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public void imprimirDados() {
		System.out.println("Informações do Carro:");
		System.out.println("Marca: " + getMarca());
		System.out.println("Modelo: " + getModelo());
		System.out.println("Ano: " + getAno());
		System.out.println("Cor: " + getCor());
		System.out.println("---------------------------");
		System.out.println();
	}
}
