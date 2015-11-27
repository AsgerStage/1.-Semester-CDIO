package matador;

import org.junit.*;

public class TaxTest {

	private Spiller spiller;
	private Felt tax;
	
	

	@Before

	public void setUp() throws Exception {

		this.spiller = new matador.Spiller("Anders And", 1, 10000);
		this.tax = new matador.Tax(4000,1, "tax+200", "", "");
		
		
	}

	@After

	public void tearDown() throws Exception {

	}

	@Test

	public void testEntities() {

		this.spiller = new Spiller("Anders And", 1, 10000);
		this.tax = new matador.Tax(4000,1, "tax+200","","");
		

		// The fields are unaltered

		Assert.assertNotNull(this.spiller);
		Assert.assertNotNull(this.tax);
	
		
	

	}

	@Test

	public void testStandardTax() {

		int expected = 10000;
		int actual = this.spiller.getKonto();
		Assert.assertEquals(expected, actual);
		// Perform the action to be tested
		this.tax.landOnField(this.spiller);
		expected= 6000;
		actual = this.spiller.getKonto();
		Assert.assertEquals(expected, actual);
		
		

	}
	@Test
	public void testPercentageTax() {

		int expected = 10000;
		int actual = this.spiller.getKonto();
		Assert.assertEquals(expected, actual);
		// Perform the action to be tested
		this.tax.landOnField(this.spiller);

		expected= 9000;
		actual = this.spiller.getKonto();
		Assert.assertEquals(expected, actual);

		

	}
	
}