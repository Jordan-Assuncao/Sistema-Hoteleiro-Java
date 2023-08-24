package classes;

public class Funcionario extends Pessoa {
    
	private double salario;
	
	public Funcionario(String nome, String email, boolean sexo, double salario) {
		super(nome, email, sexo);
		this.salario = salario;

	}
	public Funcionario (Funcionario funcionario) {
    	super(funcionario.nome, funcionario.email, funcionario.sexo);
    	this.salario = funcionario.salario;
	}
	
	@Override
	public String formatarNome(String nome) {
		return (this.sexo) ? "Senhor "+nome : "Senhora "+nome;
	}

	

	@Override
	public String toString() {
		return "" + nome + " ";
	}
	@Override
	public String IdentificaPessoa(String nome) {
		return  (this.sexo) ? "Funcionario: "+nome : "Funcionaria: "+nome;
    }
	
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}
	
}
	
