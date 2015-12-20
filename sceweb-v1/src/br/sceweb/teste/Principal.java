package br.sceweb.teste;

import static org.junit.Assert.assertEquals;

import br.sceweb.controle.IncluirEmpresa;
import br.sceweb.model.FabricaDeConexoes;
import br.sceweb.model.Fachada;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Fachada fachada = new Fachada();
		fachada.incluirEmpresa("empresa x", "98558846000146", "empresa x", "rua taquari", "1234", "jose", "1234", "contabilidade", "jose@email");
		FabricaDeConexoes fabrica = new FabricaDeConexoes();
		
		fabrica.getConnection();
		
	}

}
