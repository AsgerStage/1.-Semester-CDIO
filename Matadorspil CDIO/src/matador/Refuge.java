package matador;

public class Refuge extends Felt
{
	double pris;
	String navn;

	
	public Refuge(String navn,double pris) //konstruktør til oprettelsen af betalingsfelter
	{
		this.pris =pris;
		this.navn=navn;
	}
	
	public void passeret(Spiller spiller)
	{

		spiller.besked("Passerer "+navn);
	}

	public void landet(Spiller spiller)                   
	{
		spiller.besked("Du er landet på "+navn+" ændring i din balance på: "+pris);
		spiller.transaktion(pris);
	}
	
}
