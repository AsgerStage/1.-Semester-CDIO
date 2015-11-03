package matador;

public class Betalingsfelt extends Felt
{
	double pris;
	String navn;

	
	public Betalingsfelt(String navn,double pris) //konstrukt�r til oprettelsen af betalingsfelter
	{
		this.pris =pris;
	}

	public void landet(Spiller sp)                   
	{
		sp.besked("Du er landet p� "+navn+" �ndring i din balance p�: "+pris);
		sp.transaktion(pris);
	}
	
}
