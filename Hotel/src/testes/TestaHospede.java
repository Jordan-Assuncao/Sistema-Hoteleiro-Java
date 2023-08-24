package testes;

import java.time.LocalDate;

import classes.Hospede;

public class TestaHospede {

	public static void main(String[] args) {
		
	
	Hospede h1 = new Hospede("Juliana", "jujufabulous@gmail.com", false,LocalDate.of(2000, 07, 15));
	Hospede h2 = new Hospede("Marcos", "marqueszero@gmail.com", true, LocalDate.of(1990, 07, 15));
	Hospede h3 = new Hospede("Claudia", "biscoito@gmail.com", false, LocalDate.of(1985, 07, 15));
	Hospede h4 = new Hospede("Wellington", "atacante@gmail.com", true, LocalDate.of(2002, 07, 15));
	Hospede h5 = new Hospede("Miguel ", "miguel@gmail.com", true, LocalDate.of(2004, 07, 15));
	
	
	 System.out.println(h1.toString());
		System.out.println();
		System.out.println(h2.toString());
		System.out.println();
		System.out.println(h3.toString());
		System.out.println();
		System.out.println(h4.toString());
		System.out.println();
		System.out.println(h5.toString());
		System.out.println();
	
	
}
}
