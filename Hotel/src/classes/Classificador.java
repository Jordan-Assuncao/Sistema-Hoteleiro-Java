package classes;

import java.util.HashMap;



public class Classificador {
	
	    private static HashMap<String, String> categoria = new HashMap<String, String>();

	    public static void classificador(Hospedagem hospedagem){
	        if(hospedagem.Valordaconta() > 30000){
	            categoria.put(hospedagem.getHospede().getNome(), "Hospede categoria: A");
	        }else{
	        	if(hospedagem.Valordaconta() >10000 && hospedagem.Valordaconta() < 30000){
		            categoria.put(hospedagem.getHospede().getNome(), "Hospede categoria: B");
	        	}else {
	            categoria.put(hospedagem.getHospede().getNome(), "Hospede categoria: C");
	        }
	    }}

	    public static String getClassificacao(String nome){
	        return categoria.get(nome);
	    }
	    

	    
	}


