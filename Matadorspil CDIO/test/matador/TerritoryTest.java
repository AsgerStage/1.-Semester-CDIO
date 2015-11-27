package matador;

import org.junit.*;

public class TerritoryTest {

	private Spiller spiller;
	private Felt territory;
	private Spiller ejer;
	

	@Before

	public void setUp() throws Exception {

		this.spiller = new matador.Spiller("Anders And", 1, 10000);
		this.territory = new matador.Territory(2000, 6000,1,"Helle", "", "");
		this.ejer = new Spiller("Andersine" , 2, 10000);
		
	}

	@After

	public void tearDown() throws Exception {

	}

	@Test

	public void testEntities() {

		this.spiller = new Spiller("Anders And", 1, 10000);
		

		// The fields are unaltered

		Assert.assertNotNull(this.spiller);
		Assert.assertNotNull(this.territory);
		Assert.assertNotNull(this.ejer);
		
	

	}

	@Test

	public void testLandOnFieldfleet() {

		int expected = 10000;
		int actual = this.ejer.getKonto();
		Assert.assertEquals(expected, actual);
		// Perform the action to be tested
		this.territory.landOnField(this.ejer);
		expected =10000-6000;
		actual=this.ejer.getKonto();
		Assert.assertEquals(expected, actual);
		expected = 10000;
		actual = this.spiller.getKonto();
		this.territory.landOnField(this.spiller);
		expected =10000-2000;
		actual=this.spiller.getKonto();
		Assert.assertEquals(expected, actual);
		expected =4000+2000;
		actual=this.ejer.getKonto();
		Assert.assertEquals(expected, actual);
		//Tester både købet af grunden, og transaktionen imellem de to spillere når leje skal betales.

	}
	
	
}