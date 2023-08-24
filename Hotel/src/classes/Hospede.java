package classes;
import java.time.LocalDate;


public class Hospede extends Pessoa {

	
	private LocalDate datanascimento;
	
	

	
	public Hospede(String nome, String email, boolean sexo, LocalDate datanascimento) {
		super(nome, email, sexo);
		this.datanascimento = datanascimento;
	}

    public Hospede (Hospede hospede) {
    	super(hospede.nome, hospede.email, hospede.sexo);
    	this.datanascimento = hospede.datanascimento;
    	
    }
    @Override
	public String formatarNome(String nome) {
		return (this.sexo) ? "Prezado Hospede: "+nome : "Prezada Hospede: "+nome;
    }
    @Override
    public String IdentificaPessoa(String nome) {
		return  "Hospede: "+nome;
    }
    
	public LocalDate getDatanascimento() {
		return datanascimento;
	}

	public void setDatanascimento(LocalDate datanascimento) {
		this.datanascimento = datanascimento;
	}

	

	@Override
	public String toString() {
		return "" + nome + ", Data de nascimento:" + datanascimento + ", Email:" + email +  "" ;
	}
	
}
