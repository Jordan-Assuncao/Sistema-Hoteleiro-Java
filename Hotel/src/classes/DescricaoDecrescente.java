package classes;

import java.util.Comparator;

public class DescricaoDecrescente implements Comparator<Consumo>{



	@Override
	public int compare(Consumo c1, Consumo c2) {
	
		return c1.getProduto().compareTo(c2.getProduto())*-1;
	}
}
	

