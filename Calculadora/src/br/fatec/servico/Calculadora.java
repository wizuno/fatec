package br.fatec.servico;

public class Calculadora {
	
	public int soma(String parcelas){
		int resultado=0;
		String[] vetordeNumeros = parcelas.split(",");
		
		for(String numero: vetordeNumeros){
			if(!numero.trim().isEmpty()){
				resultado += Integer.parseInt(numero);
			}
		}
		return resultado;
	}
	
}
