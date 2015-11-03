package matador;

public class Spiller 
{

		String navn;
		double konto;
		public int slag;
		int position;
		
		public Spiller(String navn, double konto)
		{
			this.navn=navn;
			this.konto=konto;
			position=0;
		}
	
		public void besked(String besked)
		{
			System.out.println(navn+": "+besked);
		}
		
		public void transaktion(double kr)
		{
			konto = konto + kr;
			System.out.println(navn+" har nu "+konto+" kr på sin konto.");
		}	
		
}

