package matador;

public class Tax extends Felt {
 
		String navn;
		double tax;

		
		public Tax (String navn, double tax) //konstruktør til oprettelsen af betalingsfelter
		{
			this.tax=tax;
			this.navn=navn;
		}
		


		public void landet(Spiller spiller)                   
		{
			spiller.besked("Du er landet på "+navn);
			{ if (spiller.spørgsmål("Tryk 'Ja' for at betale 4000kr - Ellers betaler du 10% af din nuværende formue"))
			{
				spiller.transaktion(-tax);
			}
			else
			{
				spiller.transaktion(-spiller.getKonto()*0.1);
			}
			}
		}
		
		
		public void passeret(Spiller spiller)
		{

			spiller.besked("Passerer "+navn);
		}
	}




