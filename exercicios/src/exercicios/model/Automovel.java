package exercicios.model;

public class Automovel {
	private String marca;
	private String modelo;
	private int ano;
	private String cor;
	private double velocidadeAtual;
	private boolean motorLigado;

	public Automovel(String marca, String modelo, int ano, String cor) {
		this.marca = marca;
		this.modelo = modelo;
		this.ano = ano;
		this.cor = cor;
		this.velocidadeAtual = 0.0;
		this.motorLigado = false;
	}

	public void ligarMotor() {
		if (!motorLigado) {
			motorLigado = true;
			System.out.println("O motor foi ligado.");
		} else {
			System.out.println("O motor já está ligado.");
		}
	}

	public void desligarMotor() {
		if (motorLigado) {
			motorLigado = false;
			System.out.println("O motor foi desligado.");
		} else {
			System.out.println("O motor já está desligado.");
		}
	}

	public void acelerar(double quantidade) {
		if (motorLigado) {
			velocidadeAtual += quantidade;
			System.out.println("Acelerando para " + velocidadeAtual + " km/h.");
		} else {
			System.out.println("Não é possível acelerar com o motor desligado.");
		}
	}

	public void frear(double quantidade) {
		if (motorLigado) {
			if (velocidadeAtual >= quantidade) {
				velocidadeAtual -= quantidade;
				System.out.println("Freando para " + velocidadeAtual + " km/h.");
			} else {
				System.out.println("Você não pode frear mais do que a velocidade atual.");
			}
		} else {
			System.out.println("Não é possível frear com o motor desligado.");
		}
	}

	public double getVelocidadeAtual() {
		return velocidadeAtual;
	}

	public boolean isMotorLigado() {
		return motorLigado;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public void setVelocidadeAtual(double velocidadeAtual) {
		this.velocidadeAtual = velocidadeAtual;
	}

	public void setMotorLigado(boolean motorLigado) {
		this.motorLigado = motorLigado;
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
