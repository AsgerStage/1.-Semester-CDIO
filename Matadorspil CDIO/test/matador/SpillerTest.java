package matador;

import static org.junit.Assert.*;

import org.junit.Test;

public class SpillerTest {

	Spiller Asger = new Spiller("Asger", 1000);
	
	
	@Test
	public void testTransaktion()
	{
		
		assertEquals(1000,Asger.getKonto(),0);
		Asger.transaktion(500);
		assertEquals(1500,Asger.getKonto(),0);
		Asger.transaktion(-2000);
		assertEquals(0,Asger.getKonto(),0);
		
}
}
