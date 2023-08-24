package testes;

import java.time.LocalDate;

import classes.Funcionario;
import classes.Hospede;

public class TestaIdentificadordePessoas {

	public static void main(String[] args) {
		
		Hospede h1 = new Hospede("Juliana", "jujufabulous@gmail.com", false,LocalDate.of(2000, 07, 15));
		Hospede h2 = new Hospede("Marcos", "marqueszero@gmail.com", true, LocalDate.of(1990, 07, 15));
		
		Funcionario f2 = new Funcionario("Wanessa", "wanessacomw@gmail.com", false, 2000);
		Funcionario f3 = new Funcionario("Joao", "joaodeminas@gmail.com", true, 1500);
	    
		
		
		
		System.out.print( h1.getTratamento());
		System.out.println();
		System.out.println( h1.IdentificaPessoa());
		System.out.println();
		System.out.print( h2.getTratamento());
		System.out.println();
		System.out.print( h2.IdentificaPessoa());
		System.out.println();
		System.out.println();
		System.out.print( f2.getTratamento());
		System.out.println();
		System.out.print( f2.IdentificaPessoa());
		System.out.println();
		System.out.println();
		System.out.print( f3.getTratamento());
		System.out.println();
		System.out.print( f3.IdentificaPessoa());
		System.out.println();

	}

}
