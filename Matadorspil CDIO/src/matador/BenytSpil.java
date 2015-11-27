package matador;
public class BenytSpil
{

	public static void main(String[] arg)
	{
		Spilleplade spil = new Spilleplade();
		Spiller Asger = new Spiller("Asger", 30000);
		spil.spillere.add(Asger);
		Spiller Basti = new Spiller("Basti", 30000);
		spil.spillere.add(Basti);
		Spiller Peter = new Spiller("Peter", 30000);
		spil.spillere.add(Peter);
		
		for (spil.spillersTur = 0; spil.spillersTur < 10000; spil.spillersTur++) {
			Spiller spiller = spil.spillere.get(spil.spillersTur % spil.spillere.size());

			spiller.slag = (int) (Math.random() * 12) + 2;
			System.out.println(spiller.navn + " st�r p� felt " + spiller.position + " og sl�r " + spiller.slag);

			for (int i = 1; i <= spiller.slag; i = i + 1) {
				spiller.position = spiller.position + 1;

				if (spiller.position == spil.felter.size())
					spiller.position = 0;
				Felt felt = spil.felter.get(spiller.position);

				if (i < spiller.slag)
					felt.passeret(spiller);
				else
					felt.landet(spiller);
				if(spiller.getKonto()<0){
				      spil.sletSpiller(spiller);
				}
				try {
					Thread.sleep(500);
				} catch (Exception e) {
				}
			}
		}
		try {
			Thread.sleep(3000);
		} catch (Exception e) {
		}
	}

	// test komentar hilsen oivind
	/*
	 * vi laver en dice med en math og new random fra 2 til 12 denne random skal
	 * lagres i en int som senere benyttes denne int adderes med en variabel som
	 * viser possisjonen til spilleren.
	 * 
	 * Det behøves også at skille mellem spiller1 og spiller2,
	 */
}
