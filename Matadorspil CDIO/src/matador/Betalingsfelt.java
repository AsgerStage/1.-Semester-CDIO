package matador;

public class Betalingsfelt extends Felt
{
	double pris;
	String navn;

	
	public Betalingsfelt(String navn,double pris) //konstrukt�r til oprettelsen af betalingsfelter
	{
		this.pris =pris;
	}

	public void landet(Spiller spiller)                   
	{
		spiller.besked("Du er landet p� "+navn+" �ndring i din balance p�: "+pris);
		spiller.transaktion(pris);
	}
	
}
