package exercicios.principal;

import java.util.Scanner;

import exercicios.model.Automovel;
import exercicios.model.Biblioteca;
import exercicios.model.Carro;
import exercicios.model.Funcionario;
import exercicios.model.Padaria;

public class Principal {
    public static void main(String[] args) {
    	
    	Scanner scan = new Scanner(System.in);
    	
    	//Automovel
    	Automovel automovel = new Automovel("Toyota", "Corolla", 2022, "Prata");
    	automovel.imprimirDados();
    	automovel.ligarMotor();
    	automovel.acelerar(50.0);
        System.out.println("Velocidade atual: " + automovel.getVelocidadeAtual() + " km/h");
        automovel.frear(20.0);
        automovel.desligarMotor();

        //Funcionario
        Funcionario novoFuncionario = new Funcionario("João", 5000.0, "TI", "Desenvolvedor");
        System.out.println("Informações do Funcionário:");
        novoFuncionario.imprimirDados();
        novoFuncionario.aumentarSalario(1000.0);
        System.out.println("\nInformações atualizadas do Funcionário:");
        novoFuncionario.imprimirDados();
    	
        //Carro
        Carro meuCarro = new Carro("Toyota", "Corolla", 2022, "Prata");
        meuCarro.imprimirDados();
        

        
        //Biblioteca
        Biblioteca biblioteca = new Biblioteca();

        System.out.print("Informe o título do livro: ");
        String titulo = scan.nextLine(); 
        biblioteca.setTituloLivro(titulo);

        System.out.print("Informe o autor do livro: ");
        String autor = scan.nextLine(); 
        biblioteca.setAutorLivro(autor);

        System.out.print("Informe o ano de publicação do livro: ");
        int anoPublicacao = scan.nextInt(); 
        biblioteca.setAnoPublicacao(anoPublicacao);

        System.out.print("Informe o número de páginas do livro: ");
        int numPaginas = scan.nextInt(); 
        biblioteca.setNumPaginas(numPaginas);

        biblioteca.imprimirDados();
        
        
        //Padaria
        Padaria padaria = new Padaria(100, 80, 120);
        padaria.verificarMaiorQuantidade();
        
        
    }
}

