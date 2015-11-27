package matador;

import org.junit.*;

public class RefugeTest {

	private Spiller spiller;
	private Felt refuge200;
	private Felt refuge0;
	private Felt refugeNeg200;

	@Before

	public void setUp() throws Exception {

		this.spiller = new matador.Spiller("Anders And", 1, 1000);
		this.refuge200 = new matador.Refuge(200, 1, "Helle +200", "", "");
		this.refuge0 = new matador.Refuge(0, 2, "Helle 0", "", "");
		this.refugeNeg200 = new matador.Refuge(-200, 3, "Helle -200", "", "");
	}

	@After

	public void tearDown() throws Exception {

	}

	@Test

	public void testEntities() {

		this.spiller = new Spiller("Anders And", 1, 1000);

		// The fields are unaltered

		Assert.assertNotNull(this.spiller);
		Assert.assertNotNull(this.refuge200);
		Assert.assertNotNull(this.refuge0);
		Assert.assertNotNull(this.refugeNeg200);
		Assert.assertTrue(this.refuge200 instanceof Refuge);
		Assert.assertTrue(this.refuge0 instanceof Refuge);
		Assert.assertTrue(this.refugeNeg200 instanceof Refuge);

	}

	@Test

	public void testLandOnField200() {

		int expected = 1000;
		int actual = this.spiller.getKonto();
		Assert.assertEquals(expected, actual);
		// Perform the action to be tested
		this.refuge200.landOnField(this.spiller);
		expected = 1000 + 200;
		actual = this.spiller.getKonto();
		Assert.assertEquals(expected, actual);
		System.out.println("1 done");

	}

@Test

public void testLandOnField200Twice() {
int expected = 1000;
int actual = this.spiller.getKonto();
Assert.assertEquals(expected, actual);

//Perform the action to be tested
this.refuge200.landOnField(this.spiller);
this.refuge200.landOnField(this.spiller);
expected = 1000;
actual = this.spiller.getKonto();

Assert.assertEquals(expected, actual);
System.out.println("2 done");

}

	@Test

	public void testLandOnField0() {
		int expected = 1000;
		int actual = this.spiller.getKonto();
		Assert.assertEquals(expected, actual);
		

		// Perform the action to be tested

		this.refuge0.landOnField(this.spiller);
		expected = 1000;
		actual = this.spiller.getKonto();
		Assert.assertEquals(expected, actual);
	     System.out.println("3 done");

	}

	@Test

	public void testLandOnField0Twice() {

		int expected = 1000;
		int actual = this.spiller.getKonto();
		Assert.assertEquals(expected, actual);
		// Perform the action to be tested
		this.refuge0.landOnField(this.spiller);
		this.refuge0.landOnField(this.spiller);
		expected = 1000;
		actual = this.spiller.getKonto();
		Assert.assertEquals(expected, actual);
		System.out.println("4 done");

	}

	@Test

	public void testLandOnFieldNeg200() {

		int expected = 1000;
		int actual = this.spiller.getKonto();
		Assert.assertEquals(expected, actual);
		// Perform the action to be tested
		this.refugeNeg200.landOnField(this.spiller);
		// It is not possible to deposit a negative amount
		expected = 1000;
		actual = this.spiller.getKonto();
		Assert.assertEquals(expected, actual);
		System.out.println("5 done");

	}

	@Test

	public void testLandOnFieldNeg200Twice() {

		int expected = 1000;
		int actual = this.spiller.getKonto();
		Assert.assertEquals(expected, actual);

		// Perform the action to be tested
		this.refugeNeg200.landOnField(this.spiller);
		this.refugeNeg200.landOnField(this.spiller);

		// It is still not possible to deposit a negative amount

		expected = 1000;
		actual = this.spiller.getKonto();
		Assert.assertEquals(expected, actual);
		System.out.println("6 done");

	}

}