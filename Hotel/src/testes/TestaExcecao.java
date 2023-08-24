package testes;

import java.time.LocalDate;

import classes.Aposento;
import classes.Consumo;
import classes.Funcionario;
import classes.Hospedagem;
import classes.Hospede;

public class TestaExcecao {

	public static void main(String[] args) {
		

			
	    Hospede h1 = new Hospede("Juliana", "jujufabulous@gmail.com", false,LocalDate.of(2000, 07, 15));
	    Consumo c1 = new Consumo (1);  
	    Aposento ap1 = new Aposento("AP1", "SUITE MASTER", 15000);
	    Funcionario f1 = new Funcionario("Teresa", "teresinhahoteleira@gmail.com", false, 1500);
	    Hospedagem n1 = new Hospedagem(h1, f1, LocalDate.of(2023, 07, 15), LocalDate.of(2022, 05, 15),ap1, c1);
	    System.out.println(n1.getDataentrada());
	    System.out.println();
	    System.out.println();
	    
}
}