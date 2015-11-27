package matador;

public class Fleet extends Felt
{
	
	Spiller ejer;
	double pris;
	String navn;
	double leje;

	
	public Fleet(String navn,double pris) //konstruktør til oprettelsen af betalingsfelter
	{
		this.pris =pris;
		this.navn=navn;
		
		
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
			spiller.fleets= spiller.fleets+1;
		}
		}
		else if (ejer.fleets==1)
		{
			spiller.besked("du er landet på en anden spillers grund, som ejer en fleet!");
			spiller.betal(ejer, 500);
		}
		else if (ejer.fleets==2)
		{
			spiller.besked("du er landet på en anden spillers grund, som ejer 2 fleets!");
			spiller.betal(ejer, 1000);
		}
		else if (ejer.fleets==3)
		{
			spiller.besked("du er landet på en anden spillers grund, som ejer 3 fleets!");
			spiller.betal(ejer, 2000);
		}
		else if (ejer.fleets==4)
		{
			spiller.besked("du er landet på en anden spillers grund, som ejer 4 fleets!");
			spiller.betal(ejer, 4000);
		}
		else {
			spiller.besked("Noget er gået helt galt råb om hjælp");
		}
	}
	
	
	public void passeret(Spiller spiller)
	{

		spiller.besked("Passerer "+navn);
	}
}
