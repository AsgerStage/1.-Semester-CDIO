package matador;

public class Laborcamp extends Felt {
	Spiller ejer;
	double pris;
	String navn;
	double leje;

	
	public Laborcamp(String navn,double pris) //konstrukt�r til oprettelsen af betalingsfelter
	{
		this.pris =pris;
		this.navn=navn;
		
		
	}
	


	public void landet(Spiller spiller)                   
	{
		spiller.besked("Du er landet p� "+navn);
		if (spiller==ejer)
		{
			spiller.besked("Du ejer denne Laborcamp");
		}
		else if (ejer==null)
		{ if (spiller.sp�rgsm�l("Vil du k�be "+navn+" for "+pris+"?"))
		{
			spiller.transaktion(-pris);
			ejer=spiller;
			spiller.laborcamps++;
		}
		}
		else
		{
			spiller.besked("du er landet p� en anden spillers grund!");
			spiller.betal(ejer, (int)Math.random()*100*spiller.laborcamps);
		}
	}
	
	
	public void passeret(Spiller spiller)
	{

		spiller.besked("Passerer "+navn);
	}
}


