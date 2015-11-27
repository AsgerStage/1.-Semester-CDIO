package matador;


	import desktop_resources.GUI;
import matador.Dice;
import matador.GameBoard;
import matador.Spiller;

	public class BenytSpil {
		static int loseCount = 0;
		static Spiller[] spillere;
		static Dice d1 = new Dice();
		static GameBoard board = new GameBoard();

		public static void main(String[] args) {
			initiate();
			while(true) {
				for(int i = 0; i < spillere.length; i++) {
					if(!spillere[i].hasLost())
						spillersTur(spillere[i]);
					for(int j = 0; j < spillere.length; j++)
						GUI.setBalance("" + spillere[i].getNumber(), spillere[i].getKonto());
				}
				if (loseCount == spillere.length - 1)
					break;
			}
			int winner = checkWinner();
			GUI.getUserButtonPressed(spillere[winner]+" has won.\nWell done", "ok");
		}

		public static void initiate() {
			board.setFields();
			int pnumber = GUI.getUserInteger("How many players", 2, 6);
			spillere = new Spiller[pnumber];
			for(int i = 0; i < pnumber; i++) {
				spillere[i] = new Spiller(i+1);
				GUI.addPlayer(""+(i+1), 0);
				GUI.setCar(1, ""+(i+1));
				GUI.setBalance("" + (i+1), spillere[i].getKonto());
			}
		}

		public static void spillersTur(Spiller spiller) {
			d1.roll();
			spiller.move(d1.getSum());
			GUI.setDice(d1.getd1(), d1.getd2());
			board.getField(spiller.getFelt()).landOnField(spiller);
			if(spiller.getKonto() <= 0) {
				loseCount++;
				spiller.lose();
				loseProperty(spiller);
				spiller.konto.setBalance(0);
				GUI.removeCar(spiller.getFelt(), "" + spiller.getNumber());
			}
		}

		public static void loseProperty(Spiller spiller) {
			for(int i = 0; i < board.getOwnables().length; i++) {
				for(int j = 0; j < board.getOwnables()[i].length; j++) {
					board.getOwnables()[i][j].lose(spiller);
				}
			}
		}

		public static int checkWinner() {
			for(int i = 0; i < spillere.length; i++) {
				if(!spillere[i].hasLost())
					return i;
			}
			return 0;
		}
	}
