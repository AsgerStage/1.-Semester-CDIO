package matador;

public class Territory extends Felt
{
	
	Spiller ejer;
	double pris;
	String navn;
	double leje;

	
	public Territory(String navn,double pris, double leje) //konstruktør til oprettelsen af betalingsfelter
	{
		this.pris =pris;
		this.navn=navn;
		this.leje=leje;
		
	}
	


	public void landet(Spiller spiller)                   
	{
		spiller.besked("Du er landet på "+navn);
		if (spiller==ejer)
		{
			spiller.besked("Du ejer dette Territory");
		}
		else if (ejer==null)
		{ if (spiller.spørgsmål("Vil du købe "+navn+" for "+pris+"?"))
		{
			spiller.transaktion(-pris);
			ejer=spiller;
		}
		}
		else
		{
			spiller.besked("du er landet på en anden spillers grund!");
			spiller.betal(ejer, leje);
		}
	}
	
	
	public void passeret(Spiller spiller)
	{

		spiller.besked("Passerer "+navn);
	}
}
