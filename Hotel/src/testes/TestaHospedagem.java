package testes;
import java.time.LocalDate;



import classes.Aposento;
import classes.Consumo;
import classes.Funcionario;
import classes.Hospedagem;
import classes.Hospede;


public class TestaHospedagem {

	public static void main(String[] args)   {
		
		
	    
		Hospede h1 = new Hospede("Juliana", "jujufabulous@gmail.com", false,LocalDate.of(2000, 07, 15));
	    Consumo c1 = new Consumo (1);  
	    Aposento ap1 = new Aposento("AP1", "SUITE MASTER", 15000);
	    Funcionario f1 = new Funcionario("Teresa", "teresinhahoteleira@gmail.com", false, 1500);
	    Hospedagem n1 = new Hospedagem(h1, f1, LocalDate.of(2022, 07, 15), LocalDate.of(2032, 05, 15),ap1, c1);
	    
	    Hospede h2 = new Hospede("Marcos", "marqueszero@gmail.com", true, LocalDate.of(1990, 07, 15));
	    Consumo c2 = new Consumo (2);  
	    Aposento ap2 = new Aposento("AP2", "QUARTO SOLTEIRO", 2000);
	    Funcionario f2 = new Funcionario("Wanessa", "wanessacomw@gmail.com", false, 2000);
	    Hospedagem n2 = new Hospedagem(h2, f2, LocalDate.of(2022, 07, 15), LocalDate.of(2024, 05, 15),ap2, c2);
	    
	    Hospede h3 = new Hospede("Claudia", "biscoito@gmail.com", false, LocalDate.of(1985, 07, 15));
	    Consumo c3 = new Consumo (3);  
	    Aposento ap3 = new Aposento("AP3", "QUARTO CASAL", 3000);
	    Funcionario f3 = new Funcionario("Joao", "joaodeminas@gmail.com", true, 1500);
	    Hospedagem n3 = new Hospedagem(h3, f3, LocalDate.of(2002, 07, 15), LocalDate.of(2022, 05, 15),ap3, c3);
	    
	    Hospede h4 = new Hospede("Wellington", "atacante@gmail.com", true, LocalDate.of(2002, 07, 15));
	    Consumo c4 = new Consumo (4);  
	    Aposento ap4 = new Aposento("AP4", "QUARTO FAMILIA", 4000);
	    Funcionario f4 = new Funcionario("Sebastiao", "tiaodooeste@gmail.com", true, 1000);
	    Hospedagem n4 = new Hospedagem(h4, f4, LocalDate.of(2022, 03, 15), LocalDate.of(2032, 05, 15),ap4, c4);
	    
	    Hospede h5 = new Hospede("Miguel ", "miguel@gmail.com", true, LocalDate.of(2004, 07, 15));
	    Consumo c5 = new Consumo (5);  
	    Aposento ap5 = new Aposento("AP5", "SUITE LUXO", 5000);
	    Funcionario f5 = new Funcionario("Souza", "souzadohotel@gmail.com", true, 1000);
	    Hospedagem n5 = new Hospedagem(h5, f5, LocalDate.of(2022, 03, 15), LocalDate.of(2022, 05, 15),ap5, c5);
	    
		
	    System.out.println(n1.toString());
		System.out.println();
		System.out.println(n2.toString());
		System.out.println();
		System.out.println(n3.toString());
		System.out.println();
		System.out.println(n4.toString());
		System.out.println();
		System.out.println(n5.toString());
		System.out.println();
		System.out.println(n1.Valordaconta());
		System.out.println();
		System.out.println(n2.Valordaconta());
		System.out.println();
		System.out.println(n3.Valordaconta());
		System.out.println();
		System.out.println(n4.Valordaconta());
		System.out.println();
		System.out.println(n5.Valordaconta());
		System.out.println();
		Consumo c6 = new Consumo (2);
		Consumo c7 = new Consumo (5);
		Consumo c8 = new Consumo (3);
		Consumo c9 = new Consumo (4);
		System.out.println(n1.AdicionarConsumo(c6));
		System.out.println(n1.AdicionarConsumo(c7));
		System.out.println(n1.AdicionarConsumo(c8));
		System.out.println(n4.AdicionarConsumo(c9));
		System.out.println();
		System.out.println(n1.RemoverConsumo(c6));
		System.out.println(n1.RemoverConsumo(c7));
		System.out.println();
		System.out.println(n1.VerificarConsumo());
		System.out.println();
		System.out.println();
		System.out.println(n1.AdicionarConsumo(c6));
		System.out.println(n1.AdicionarConsumo(c7));
		System.out.println();
		System.out.println();
		System.out.println(n1.Recibo());
		System.out.println(n2.Recibo());
		System.out.println(n3.Recibo());
		System.out.println(n4.Recibo());
		System.out.println(n5.Recibo());
		System.out.println();
		System.out.println();
		System.out.println(n1.getDescricaoDecrescente());
		System.out.println(n1.getDescricaoCrescente());
		System.out.println(n1.getCriterioValor());
		
	
	}
}
