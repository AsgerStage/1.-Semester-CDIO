package matador;

public class Betalingsfelt extends Felt
{
	double pris;
	String navn;

	
	public Betalingsfelt(String navn,double pris) //konstruktør til oprettelsen af betalingsfelter
	{
		this.pris =pris;
	}

	public void landet(Spiller sp)                   
	{
		sp.besked("Du er landet på "+navn+" Ændring i din balance på: "+pris);
		sp.transaktion(pris);
	}
	
}
