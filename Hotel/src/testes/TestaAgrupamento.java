package testes;

import classes.Agrupamento;
import classes.Aposento;
import classes.Funcionario;
import classes.Hospede;
import java.time.LocalDate;

public class TestaAgrupamento {

	public static void main(String[] args) {
	    
		
		Agrupamento<Hospede> agrupamentoDeHospede = new Agrupamento<>();
		agrupamentoDeHospede.adiciona(new Hospede("Juliana", "jujufabulous@gmail.com", false,LocalDate.of(2000, 07, 15)));
		agrupamentoDeHospede.adiciona(new Hospede("Marcos", "marqueszero@gmail.com", true, LocalDate.of(1990, 07, 15)));
		agrupamentoDeHospede.adiciona(new Hospede("Claudia", "biscoito@gmail.com", false, LocalDate.of(1985, 07, 15)));
		agrupamentoDeHospede.adiciona(new Hospede("Wellington", "atacante@gmail.com", true, LocalDate.of(2002, 07, 15)));
		agrupamentoDeHospede.adiciona(new Hospede("Miguel ", "miguel@gmail.com", true, LocalDate.of(2004, 07, 15)));
		
        while (agrupamentoDeHospede.temItens()) {
			System.out.println(agrupamentoDeHospede.retira());
		}
        Agrupamento<Funcionario> agrupamentoDeFuncionario = new Agrupamento<>();
		agrupamentoDeFuncionario.adiciona(new Funcionario("Teresa", "teresinhahoteleira@gmail.com", false, 1500));
		agrupamentoDeFuncionario.adiciona(new Funcionario("Wanessa", "wanessacomw@gmail.com", false, 2000));
		agrupamentoDeFuncionario.adiciona(new Funcionario("Joao", "joaodeminas@gmail.com", true, 1500));
		agrupamentoDeFuncionario.adiciona(new Funcionario("Sebastiao", "tiaodooeste@gmail.com", true, 1000));
		agrupamentoDeFuncionario.adiciona(new Funcionario("Souza", "souzadohotel@gmail.com", true, 1000));;
		
     
        while (agrupamentoDeFuncionario.temItens()) {
			System.out.println(agrupamentoDeFuncionario.retira());
		}
	    Agrupamento<Aposento> agrupamentoDeAposento = new Agrupamento<>();
	    agrupamentoDeAposento.adiciona(new Aposento("AP1", "SUITE MASTER", 15000));
	    agrupamentoDeAposento.adiciona(new Aposento("AP2", "QUARTO SOLTEIRO", 2000));
	    agrupamentoDeAposento.adiciona(new Aposento("AP3", "QUARTO CASAL", 3000));
	    agrupamentoDeAposento.adiciona(new Aposento("AP4", "QUARTO FAMILIA", 4000));
	    agrupamentoDeAposento.adiciona(new Aposento("AP5", "SUITE LUXO", 5000));
	
 
        while (agrupamentoDeAposento.temItens()) {
		    System.out.println(agrupamentoDeAposento.retira());
	}
	
}
}


