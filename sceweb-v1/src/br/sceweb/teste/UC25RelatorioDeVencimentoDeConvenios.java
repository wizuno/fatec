package br.sceweb.teste;

import static org.junit.Assert.*;

import org.joda.time.DateTime;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import br.sceweb.model.Convenio;

public class UC25RelatorioDeVencimentoDeConvenios {
	static Convenio convenio;
	static String dataInicio;
	static String dataFinal;
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		convenio = new Convenio();
		convenio.setDataInicio("01/01/2015");
		convenio.setDataInicio("30/06/2015");
	}
	@Test
	public void test() {
		DateTime dataTermino = new DateTime(2015,6,30,0,0);
		DateTime dataHoje = new DateTime(2015, 3, 31, 0, 0);
		assertEquals(91, convenio.periodoDeVigencia(dataHoje, dataTermino));
	}
	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}
}
