package exercicios.model;

public class Funcionario {
	private String nome;
	private double salario;
	private String departamento;
	private String cargo;

	public Funcionario(String nome, double salario, String departamento, String cargo) {
		this.nome = nome;
		this.salario = salario;
		this.departamento = departamento;
		this.cargo = cargo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	public String getDepartamento() {
		return departamento;
	}

	public void setDepartamento(String departamento) {
		this.departamento = departamento;
	}

	public String getCargo() {
		return cargo;
	}

	public void setCargo(String cargo) {
		this.cargo = cargo;
	}

	public void aumentarSalario(double aumento) {
		this.salario += aumento;
	}

	public void imprimirDados() {
		System.out.println("Nome: " + getNome());
		System.out.println("Departamento: " + getDepartamento());
		System.out.println("Cargo: " + getCargo());
		System.out.println("Salário: " + getSalario());
		System.out.println("---------------------------");
		System.out.println();
	}
}
