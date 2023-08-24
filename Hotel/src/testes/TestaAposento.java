package testes;
import classes.Aposento;

public class TestaAposento {

	public static void main(String[] args) {
		
		Aposento ap1 = new Aposento("AP1", "SUITE MASTER", 1500);
		Aposento ap2 = new Aposento("AP2", "QUARTO SOLTEIRO", 200);
		Aposento ap3 = new Aposento("AP3", "QUARTO CASAL", 300);
		Aposento ap4 = new Aposento("AP4", "QUARTO FAMILIA", 400);
		Aposento ap5 = new Aposento("AP5", "SUITE LUXO", 500);
		

		 System.out.print("Quarto: "+ap1.getAposento()+" ");
	        System.out.print("Descricao: "+ap1.getDescricao()+" ");
	        System.out.println("Diaria: "+ap1.getDiaria()+" ");
	        System.out.println();
	        System.out.print(" "+ap2.getAposento());
	        System.out.print(" "+ap2.getDescricao());
	        System.out.println(" "+ap2.getDiaria());
	        System.out.println();
	        System.out.print(" "+ap3.getAposento());
	        System.out.print(" "+ap3.getDescricao());
	        System.out.println(" "+ap3.getDiaria());
	        System.out.println();
	        System.out.print(" "+ap4.getAposento());
	        System.out.print(" "+ap4.getDescricao());
	        System.out.println(" "+ap4.getDiaria());
	        System.out.println();
	        System.out.print(" "+ap5.toString());
	        System.out.println();

		
	}

}
