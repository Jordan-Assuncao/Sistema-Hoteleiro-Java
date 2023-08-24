package testes;

import java.time.LocalDate;

import classes.Aposento;
import classes.Classificador;
import classes.Consumo;
import classes.DataInvalidaException;
import classes.Funcionario;
import classes.Hospedagem;
import classes.Hospede;


public class TestaClassificador {
	public static void main(String[] args) throws DataInvalidaException {
		
		
		Hospede h1 = new Hospede("Juliana", "jujufabulous@gmail.com", false,LocalDate.of(2000, 07, 15));
	    Consumo c1 = new Consumo (1);  
	    Aposento ap1 = new Aposento("AP1", "SUITE MASTER", 15000);
	    Funcionario f1 = new Funcionario("Teresa", "teresinhahoteleira@gmail.com", false, 1500);
	    Hospedagem n1 = new Hospedagem(h1, f1, LocalDate.of(2022, 07, 15), LocalDate.of(2022, 05, 15),ap1, c1);
	    
	    Hospede h2 = new Hospede("Marcos", "marqueszero@gmail.com", true, LocalDate.of(1990, 07, 15));
	    Consumo c2 = new Consumo (2);  
	    Aposento ap2 = new Aposento("AP2", "QUARTO SOLTEIRO", 2000);
	    Funcionario f2 = new Funcionario("Wanessa", "wanessacomw@gmail.com", false, 2000);
	    Hospedagem n2 = new Hospedagem(h2, f2, LocalDate.of(2022, 07, 15), LocalDate.of(2024, 05, 15),ap2, c2);
	    
	    Hospede h3 = new Hospede("Claudia", "biscoito@gmail.com", false, LocalDate.of(1985, 07, 15));
	    Consumo c3 = new Consumo (3);  
	    Aposento ap3 = new Aposento("AP3", "QUARTO CASAL", 3000);
	    Funcionario f3 = new Funcionario("Joao", "joaodeminas@gmail.com", true, 1500);
	    Hospedagem n3 = new Hospedagem(h3, f3, LocalDate.of(2032, 07, 15), LocalDate.of(2022, 05, 15),ap3, c3);
	    
		Classificador.classificador(n1);
		System.out.println(Classificador.getClassificacao(n1.getHospede().getNome()));
		Classificador.classificador(n2);
		System.out.println(Classificador.getClassificacao(n2.getHospede().getNome()));
		Classificador.classificador(n3);
		System.out.println(Classificador.getClassificacao(n3.getHospede().getNome()));
		
		
	}
}
