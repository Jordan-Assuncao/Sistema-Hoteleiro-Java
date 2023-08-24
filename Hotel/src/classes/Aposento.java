package classes;

public class Aposento {

	private String aposento;
	private String descricao;
	private String identificadoraposento;
	private double Diaria;
    private static int contador = 1;
	
	public Aposento(String aposento, String descricao, double Diaria) {
		this.aposento = aposento;
		this.descricao = descricao;
		this.Diaria = Diaria;
		this.identificadoraposento = " CONS" + contador++;
	}

	public Aposento (Aposento aposento) {
		this.aposento = aposento.aposento;
		this.descricao = aposento.descricao;
		this.Diaria = aposento.Diaria;
		this.identificadoraposento = aposento.identificadoraposento;
	
	
	}
	public String getIdentificadoraposento() {
		return identificadoraposento;
	}

	public void setIdentificadoraposento(String identificadoraposento) {
		this.identificadoraposento = identificadoraposento;
	}

	public static int getContador() {
		return contador;
	}

	@Override
	public String toString() {
		return ""+ aposento + ",  Diaria: " + Diaria + ", Identificadoraposento: "
				+ identificadoraposento + ", Descricao: " + descricao + "";
	}

	public String getAposento() {
		return aposento;
	}

	public void setAposento(String aposento) {
		this.aposento = aposento;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public double getDiaria() {
		return Diaria;
	}

	public void setDiaria(double diaria) {
		Diaria = diaria;
	}

	
}
