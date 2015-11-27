package matador;

public class Laborcamp extends Felt {
	Spiller ejer;
	double pris;
	String navn;
	

	
	public Laborcamp(String navn,double pris) //konstruktør til oprettelsen af betalingsfelter
	{
		this.pris =pris;
		this.navn=navn;
		
		
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
			spiller.laborcamps=spiller.laborcamps+1;
		}
		}
		else
		{
			spiller.besked("du er landet på en anden spillers grund!");
			spiller.betal(ejer,spiller.slag*100*ejer.laborcamps);
		}
	}
	
	
	public void passeret(Spiller spiller)
	{

		spiller.besked("Passerer "+navn);
	}
}


