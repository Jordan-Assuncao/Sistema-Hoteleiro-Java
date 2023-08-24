package classes;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;

public class Hospedagem {

	ArrayList<Consumo> listaconsumo;
	Hospede hospede;
	Consumo consumo;
	Funcionario funcionario;
	Aposento aposento;
	public static int contador;
	public static int ano = 0;
	private LocalDate dataentrada;
	private LocalDate datasaida;
	private String identificador;

	public Hospedagem(Hospede hospede, Funcionario funcionario, LocalDate dataentrada, LocalDate datasaida, Aposento aposento,
			Consumo consumo) {
		this.hospede = hospede;
		this.funcionario = funcionario;
		this.aposento = aposento;
		this.listaconsumo = new ArrayList<Consumo>();
		this.listaconsumo.add(consumo);
		this.datasaida = datasaida;
		int anoatual = dataentrada.getYear();
		this.dataentrada = dataentrada;
		try {
			 setDatasaida(datasaida);
	        }catch (DataInvalidaException ex){
	            System.out.println(ex.getMessage());
	        }

		if (ano != anoatual) {
			ano = anoatual;
			contador = 1;
		}
		identificador = dataentrada.getYear() + "-" + contador++;
		 
	}

	public LocalDate getDataentrada() {
		return dataentrada;
	}

	public void setDataentrada(LocalDate dataentrada) {
		
		this.dataentrada = dataentrada;
		
	}

	public Hospede getHospede() {
		return new Hospede(this.hospede);
	}

	public void setHospede(Hospede hospede) {
		this.hospede = hospede;
	}

	public Funcionario getFuncionario() {
		return new Funcionario(this.funcionario);
	}

	public void setFuncionario(Funcionario funcionario) {
		this.funcionario = funcionario;
	}

	public Object getListaconsumo() {
		return listaconsumo.clone();
	}

	public void setListaconsumo(ArrayList<Consumo> listaconsumo) {
		this.listaconsumo = listaconsumo;
	}

	public Aposento getAposento() {
		return new Aposento(this.aposento);
	}

	public void setAposento(Aposento aposento) {
		this.aposento = aposento;
	}

	public LocalDate getDatasaida() {
		return datasaida;
	}

	public boolean setDatasaida(LocalDate datasaida)throws DataInvalidaException{
		if (datasaida.isBefore(dataentrada)) {
	        throw new DataInvalidaException("Data invalida");
	    }
		this.datasaida = datasaida;
	    return true; 	
	}


	public String getIdentificador() {
		return identificador;
	}

	public void setIdentificador(String identificador) {
		this.identificador = identificador;
	}

	@Override
	public String toString() {
		return "Funcionario Responsavel: " + funcionario + ", Hospede: " + hospede + ", Aposento: " + aposento
				+ ", Data de entrada: " + dataentrada + ", Data de Saida: " + datasaida + ", Identificador: "
				+ identificador + ", Consumo: " + listaconsumo;
	}

	public double Valordaconta() {
		double total = 0;
		for (Consumo m : this.listaconsumo) {
			if (m != null) {
				total = total + m.getPreco() + aposento.getDiaria();
			}
		}
		return  total;
	}
	public String AdicionarConsumo(Consumo consumo) { 
		listaconsumo.add(consumo);
		return "Consumo Adcionado";
		}
	public String RemoverConsumo(Consumo consumo) { 
		listaconsumo.remove(consumo);
		return "Consumo deletado";
		}
	public String VerificarConsumo() { 
		for (Consumo c : listaconsumo)  {
				System.out.println("Verificando consumo "+c);
	}
		return "Consumo verificado" ;
        }
	public String Recibo() {
		return "Hospede: " + hospede + ", Aposento: " + aposento
				+ ", Data de entrada: " + dataentrada + ", Data de Saida: " + datasaida + ", Consumo: " + listaconsumo + ", Total: " + Valordaconta();
	}
	public String getDescricaoDecrescente() {
	DescricaoDecrescente descricaoDecrescente = new DescricaoDecrescente();
	Collections.sort(listaconsumo, descricaoDecrescente);
    for (Consumo c:listaconsumo) {
    	System.out.println(c);
    }
	return "";
	}
	public String getDescricaoCrescente() {
		
		DescricaoCrescente descricaoCrescente = new DescricaoCrescente();
		Collections.sort(listaconsumo, descricaoCrescente);
	    for (Consumo c:listaconsumo) {
	    	System.out.println(c);
}
	    return "";
}
	public String getCriterioValor() {
		CriterioValor criterioValor = new CriterioValor();
		Collections.sort(listaconsumo, criterioValor);
	    for (Consumo c:listaconsumo) {
	    	System.out.println(c);
}
	    return "";
}
}