package matador;

import static org.junit.Assert.*;

import org.junit.Test;

public class SpillerTest {

	Spiller Asger = new Spiller("Asger", 1000);
	int konto =1000;
	String navn= "testnavn";
	int kr = 500;
	@Test
	public void testTransaktion()
	{
		System.out.println(Asger.getKonto());
		assertEquals(1000,Asger.getKonto(),0);
}
	}
