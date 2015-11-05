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
	}
	@Test
	public void test() {
		DateTime di = new DateTime(2015, 1, 1, 0, 0);
		DateTime df = new DateTime(2015, 6, 30, 0, 0);
		assertEquals(180, convenio.periodoDeVigencia(di, df));
	}
	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}
}
