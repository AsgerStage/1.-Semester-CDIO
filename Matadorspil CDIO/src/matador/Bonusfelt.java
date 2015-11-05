package matador;

public class Bonusfelt extends Felt
{
	double pris;
	String navn;

	
	public Bonusfelt(String navn,double pris) //konstrukt�r til oprettelsen af betalingsfelter
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
		Spilleplade.spillersTur = Spilleplade.spillersTur -1;
		spiller.besked("Du er landet p� bonus felt "+navn+" �ndring i din balance p�: "+pris+" og du f�r endnu en tur!");
		spiller.transaktion(pris);
	}
	
}
