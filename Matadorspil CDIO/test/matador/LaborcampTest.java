package matador;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class LaborcampTest  {
	private Dice twoDiceRollsSixes;
	private Spiller spiller;
	private Felt Laborcamp;
	private Spiller ejer;
	 
	  @Before
	  public void setUp() {
	    twoDiceRollsSixes = new Dice() {
			@Override
			public void roll() {
				setd1(6);
				setd2(6);
				
	  		}
	    };
	    

		this.spiller = new matador.Spiller("Anders And", 1, 10000);
		this.Laborcamp = new Laborcamp(10000, 1200,15,"test", "", "");
		this.ejer = new Spiller("Andersine" , 2, 10000);
	  }
	  
	  @Test
	  public void laborTest() {
	    twoDiceRollsSixes.roll();
	    assertEquals(twoDiceRollsSixes.getSum(),(12));
	  }
	  public void testEntities() {

			this.spiller = new Spiller("Anders And", 1, 10000);
			

			// The fields are unaltered

			Assert.assertNotNull(this.spiller);
			Assert.assertNotNull(this.Laborcamp);
			Assert.assertNotNull(this.ejer);
			
		

		}

		@Test

		public void testLandOnFieldLaborcamp() {

			int expected = 10000;
			int actual = this.ejer.getKonto();
			Assert.assertEquals(expected, actual);
			this.Laborcamp.landOnField(this.ejer);
			expected =10000-1200;
			actual=this.ejer.getKonto();
			Assert.assertEquals(expected, actual);
			
			
	}
		@Test
		public void testLandOnFieldLaborcamp2() {

			int expected = 10000;
			int actual = this.ejer.getKonto();
			Assert.assertEquals(expected, actual);
			// Perform the action to be tested
			this.Laborcamp.landOnField(this.ejer);
	ejer.addCamp();
			expected= 10000;
			actual = this.spiller.getKonto();
			Assert.assertEquals(expected, actual);
			this.Laborcamp.landOnField(this.spiller);
			expected =7600;
			actual=this.spiller.getKonto();
			Assert.assertEquals(expected, actual);
}
}