package classes;

import java.util.Comparator;

public class CriterioValor implements Comparator<Consumo>{


	@Override
	public int compare(Consumo c1, Consumo c2) {
		if(c1.getPreco() > c2.getPreco()) {
			return 1;
		}else {
			if(c1.getPreco() < c2.getPreco()) {
			return -1;
			}else {
		return 0;
		}
		}
	}
}