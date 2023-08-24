package classes;



public class Consumo {

	private int consumo;
	private String produto;
	private double preco;
	private String identificadordeconsumo;
	private static int contador = 1;
	
	
	
	public Consumo(int consumo) {
		this.consumo = consumo;
	 if (consumo == 1) {
		this.produto = "AGUA MINERAL";
		this.preco = 30000.00;
		this.identificadordeconsumo = " CONS" + contador++;
	}
	 if (consumo == 2) {
			this.produto = "CERVEJA SKOL";
			this.preco = 900.90;
			identificadordeconsumo = " CONS" + contador++;
			}
	 if (consumo == 3) {
			this.produto = "COCA COLA";
			this.preco = 10000.90;
			identificadordeconsumo = " CONS" + contador++;
			}
	 if (consumo == 4) {
			this.produto = "CAFE DA MANHA VIP";
			this.preco = 500.00;
			identificadordeconsumo = " CONS" + contador++;
			}
	 if (consumo == 5) {
			this.produto = "JANTAR A LUZ DE VELAS";
			this.preco = 30000.90;
			identificadordeconsumo = " CONS" + contador++;
			} 
	}
	
	public Consumo (Consumo consumo) {
		this.consumo = consumo.consumo;
		this.produto = consumo.produto;
		this.preco = consumo.preco;
		this.identificadordeconsumo = consumo.identificadordeconsumo;
	}


	public String getProduto() {
		return produto;
	}


	public void setProduto(String produto) {
		this.produto = produto;
	}


	public  double getPreco() {
		return preco;
	}


	public void setPreco(double preco) {
		this.preco = preco;
	}


	
	public String toString() {
		return "" + produto + ", Preco:" + preco + ", Identificadordeconsumo:" + identificadordeconsumo
				+ "";
	}


	public String getIdentificadordeconsumo() {
		return identificadordeconsumo;
	}


	public void setIdentificadordeconsumo(String identificadordeconsumo) {
		this.identificadordeconsumo = identificadordeconsumo;
	}


	



       
            
       
}