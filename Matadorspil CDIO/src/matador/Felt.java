package matador;

public abstract class Felt
{
		String navn;
		
		/*landet og passeret metoder til at kalde når spillere lander/passerer felter */
		public void landet(Spiller spiller)
		{
			
		}
		
		public void passeret(Spiller spiller)
		{
			spiller.besked("Passerer "+navn);
		}
	}


