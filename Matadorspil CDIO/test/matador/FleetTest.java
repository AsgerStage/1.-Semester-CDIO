package matador;

import org.junit.*;

public class FleetTest {

	private Spiller spiller;
	private Felt fleet;
	private Spiller ejer;
	

	@Before

	public void setUp() throws Exception {

		this.spiller = new matador.Spiller("Anders And", 1, 10000);
		this.fleet = new matador.Fleet(2000, 1, "Helle +200", "", "");
		this.ejer = new Spiller("Andersine" , 1, 10000);
		
	}

	@After

	public void tearDown() throws Exception {

	}

	@Test

	public void testEntities() {

		this.spiller = new Spiller("Anders And", 1, 10000);
		

		// The fields are unaltered

		Assert.assertNotNull(this.spiller);
		Assert.assertNotNull(this.fleet);
		Assert.assertNotNull(this.ejer);
		
	

	}

	@Test

	public void testLandOnFieldfleet() {

		int expected = 10000;
		int actual = this.ejer.getKonto();
		Assert.assertEquals(expected, actual);
		// Perform the action to be tested
		this.fleet.landOnField(this.ejer);
		expected= 10000;
		actual = this.spiller.getKonto();
		Assert.assertEquals(expected, actual);
		this.fleet.landOnField(this.spiller);
		expected =9500;
		actual=this.spiller.getKonto();
		Assert.assertEquals(expected, actual);
		

	}
	@Test
	public void testLandOnFieldfleet2() {

		int expected = 10000;
		int actual = this.ejer.getKonto();
		Assert.assertEquals(expected, actual);
		// Perform the action to be tested
		this.fleet.landOnField(this.ejer);
ejer.addFleet();
		expected= 10000;
		actual = this.spiller.getKonto();
		Assert.assertEquals(expected, actual);
		this.fleet.landOnField(this.spiller);
		expected =9000;
		actual=this.spiller.getKonto();
		Assert.assertEquals(expected, actual);
		

	}
	@Test
	public void testLandOnFieldfleet3() {

		int expected = 10000;
		int actual = this.ejer.getKonto();
		Assert.assertEquals(expected, actual);
		// Perform the action to be tested
		this.fleet.landOnField(this.ejer);
ejer.addFleet();
ejer.addFleet();
		expected= 10000;
		actual = this.spiller.getKonto();
		Assert.assertEquals(expected, actual);
		this.fleet.landOnField(this.spiller);
		expected =8000;
		actual=this.spiller.getKonto();
		Assert.assertEquals(expected, actual);
		

	}
	@Test
	public void testLandOnFieldfleet4() {

		int expected = 10000;
		int actual = this.ejer.getKonto();
		Assert.assertEquals(expected, actual);
		// Perform the action to be tested
		this.fleet.landOnField(this.ejer);
ejer.addFleet();
ejer.addFleet();
ejer.addFleet();
		expected= 10000;
		actual = this.spiller.getKonto();
		Assert.assertEquals(expected, actual);
		this.fleet.landOnField(this.spiller);
		expected =6000;
		actual=this.spiller.getKonto();
		Assert.assertEquals(expected, actual);
		

	}
	
}