package testes;

import classes.Funcionario;

public class TestaFuncionario {

	public static void main(String[] args) {
		
		Funcionario f1 = new Funcionario("Teresa", "teresinhahoteleira@gmail.com", false, 1500);
		Funcionario f2 = new Funcionario("Wanessa", "wanessacomw@gmail.com", false, 2000);
		Funcionario f3 = new Funcionario("Joao", "joaodeminas@gmail.com", true, 1500);
	    Funcionario f4 = new Funcionario("Sebastiao", "tiaodooeste@gmail.com", true, 1000);
		Funcionario f5 = new Funcionario("Souza", "souzadohotel@gmail.com", true, 1000);

		
		
		System.out.print("Nome: "+f1.getNome()+" ");
        System.out.print("Salario: "+f1.getSalario()+" ");
        System.out.println("Email: "+f1.getEmail()+" ");
        System.out.println();
        System.out.print(" "+f2.getNome());
        System.out.print(" "+f2.getSalario());
        System.out.println(" "+f2.getEmail());
        System.out.println();
        System.out.print(" "+f3.getNome());
        System.out.print(" "+f3.getSalario());
        System.out.println(" "+f3.getEmail());
        System.out.println();
        System.out.print(" "+f4.getNome());
        System.out.print(" "+f4.getSalario());
        System.out.println(" "+f4.getEmail());
        System.out.println();
        System.out.print(" "+f5.getNome());
        System.out.print(" "+f5.getSalario());
        System.out.println(" "+f5.getEmail());
	}

}
