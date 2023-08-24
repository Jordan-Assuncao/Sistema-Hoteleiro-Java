package classes;

public abstract class Pessoa implements IdentificadorDePessoas {
	protected String nome;
	protected String email;
	protected boolean sexo;
	
	public Pessoa (String nome, String email, boolean sexo) {
		this.nome = nome;
		this.email = email;
		this.sexo = sexo;
	}
	public Pessoa(Pessoa pessoa) {
		this.nome = pessoa.nome;
		this.email = pessoa.email;
		this.sexo = pessoa.sexo;
	}
	
	@Override
	public String formatarNome(String nome) {
		return (this.sexo) ? "Sr. "+nome : "Sra. "+nome;
	}

	public String getTratamento() {
		return this.formatarNome(nome);
	}
	public String IdentificaPessoa() {
		return this.IdentificaPessoa(nome);
    }
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public boolean getSexo() {
		return sexo;
	}
	public void setSexo(boolean sexo) {
		this.sexo = sexo;
	}

}
