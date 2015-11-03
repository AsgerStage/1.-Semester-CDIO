package matador;

public class Start extends Felt
{
	double pris;
	

	
	public Start(double pris) //konstruktør til oprettelsen af startfelt
	{
		this.pris =pris;
		navn="start";
	}

	public void passeret(Spiller spiller)                 // tilsidesæt metode i Felt
	{
		spiller.besked("Du passerer start og modtager "+pris);
		spiller.transaktion(pris);                      // kredit/debit af konto
	}
	
	public void landet(Spiller spiller)                   
	{
		spiller.besked("Du lander på start og modtager: "+pris);
		spiller.transaktion(pris);
	}
	
}
