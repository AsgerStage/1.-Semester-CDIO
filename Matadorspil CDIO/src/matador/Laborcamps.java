package matador;

public class Laborcamps {
	Spiller ejer;
	double pris;
	String navn;
	double leje;

	
	public Laborcamps(String navn,double pris, double leje) //konstruktør til oprettelsen af betalingsfelter
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
			spiller.besked("Du ejer denne Laborcamp");
		}
		else if (ejer==null)
		{ if (spiller.spørgsmål("Vil du købe "+navn+" for "+pris+"?"))
		{
			spiller.transaktion(-pris);
			ejer=spiller;
			spiller.laborcamps++;
		}
		}
		else
		{
			spiller.besked("du er landet på en anden spillers grund!");
			spiller.betal(ejer, (int)Math.random()*100*spiller.laborcamps);
		}
	}
	
	
	public void passeret(Spiller spiller)
	{

		spiller.besked("Passerer "+navn);
	}
}


