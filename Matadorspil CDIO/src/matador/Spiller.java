package matador;

public class Spiller {

	String navn;
	double konto;
	public int slag;
	int position;

	public Spiller(String navn, double konto) {
		this.navn = navn;
		this.konto = konto;
		position = 0;
	}

	public void besked(String besked) {
		System.out.println(navn + ": " + besked);
	}

	public void transaktion(double kr)
		{
			konto = konto + kr;
			System.out.println(navn+" har nu "+konto+" kr på sin konto.");
			if (konto<0)
			{
				konto=0;
				System.out.println(navn+" er gået i minus, og kontoen er derfor sat til 0");
			}
			
			if (konto>=3000){
				System.out.println(navn+" har 3000 kroner og har vundet!!!");
				System.exit(0); 
			}
		}
		
	public double getKonto()
			{
				return konto;
			}
	public boolean spørgsmål(String spørgsmål)
	{
		String spm = navn+": Vil du "+spørgsmål+"?";
		String svar = javax.swing.JOptionPane.showInputDialog(spm, "ja");
		System.out.println(spm+" "+svar);
		if (svar!=null && svar.equals("ja")) return true;
		else return false;
	}
	
	public void betal(Spiller modtager, double kr)
	{
		System.out.println(navn+" betaler "+modtager.navn+" "+kr+" kroner");
		transaktion(-kr);
		modtager.transaktion(kr);
		
	}
}

