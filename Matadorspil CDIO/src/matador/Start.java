package matador;

public class Start extends Felt
{
	double pris;
	

	
	public Start(double pris) //konstrukt�r til oprettelsen af startfelt
	{
		this.pris =pris;
		navn="start";
	}

	public void passeret(Spiller spiller)                 // tilsides�t metode i Felt
	{
		spiller.besked("Du passerer start og modtager "+pris);
		spiller.transaktion(pris);                      // kredit/debit af konto
	}
	
	public void landet(Spiller spiller)                   
	{
		spiller.besked("Du lander p� start og modtager: "+pris);
		spiller.transaktion(pris);
	}
	
}
