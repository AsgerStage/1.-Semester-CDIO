package matador;

public class Betalingsfelt extends Felt
{
	double pris;
	String navn;

	
	public Betalingsfelt(String navn,double pris) //konstruktør til oprettelsen af betalingsfelter
	{
		this.pris =pris;
	}

	public void landet(Spiller spiller)                   
	{
		spiller.besked("Du er landet på "+navn+" Ændring i din balance på: "+pris);
		spiller.transaktion(pris);
	}
	
}
