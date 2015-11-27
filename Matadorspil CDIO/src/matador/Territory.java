package matador;

public class Territory extends Felt
{
	
	Spiller ejer;
	double pris;
	String navn;
	double leje;

	
	public Territory(String navn,double pris, double grundleje) //konstrukt�r til oprettelsen af betalingsfelter
	{
		this.pris =pris;
		this.navn=navn;
		this.leje=grundleje;
		
	}
	


	public void landet(Spiller spiller)                   
	{
		spiller.besked("Du er landet p� "+navn);
		if (spiller==ejer)
		{
			spiller.besked("Du ejer dette Territory");
		}
		else if (ejer==null)
		{ if (spiller.sp�rgsm�l("Vil du k�be "+navn+" for "+pris+"?"))
		{
			spiller.transaktion(-pris);
			ejer=spiller;
		}
		}
			
	}
	
	
	public void passeret(Spiller spiller)
	{

		spiller.besked("Passerer "+navn);
	}
}
