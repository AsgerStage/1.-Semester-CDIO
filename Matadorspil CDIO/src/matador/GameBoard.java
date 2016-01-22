package matador;


import matador.Felt;
import matador.Fleet;
import matador.Laborcamp;
import matador.Ownable;
import matador.Refuge;
import matador.Tax;
import matador.Territory;


public class GameBoard {
	private static final int TERRITORIES = 28;
	private static final int REFUGES = 2;
	private static final int LABOR_CAMPS = 3;
	private static final int TAXES = 2;
	private static final int FLEETS = 4;
	private static final int TYPES = 5;
	
	private Felt[][] board;
	private Ownable[][] ownables;
	private Territory[] territories;
	private Refuge[] refuges;
	private Laborcamp[] laborCamps;
	private Tax[] taxes;
	private Fleet[] fleets;

	public GameBoard() {
		board = new Felt[TYPES][];
		ownables = new Ownable[3][];
		territories = new Territory[TERRITORIES];
		refuges = new Refuge[REFUGES];
		laborCamps = new Laborcamp[LABOR_CAMPS];
		taxes = new Tax[TAXES];
		fleets = new Fleet[FLEETS];
		board[0] = territories;
		board[1] = refuges;
		board[2] = laborCamps;
		board[3] = taxes;
		board[4] = fleets;
		ownables[0] = territories;
		ownables[1] = laborCamps;
		ownables[2] = fleets;
	}
	
	public void setFields() {
		territories[0] = new Territory(100, 1000, 1, "RABAT", "Pris: 1000\n Rent: 100", "Køb en by");
		territories[1] = new Territory(150, 1000, 2, "NAIROBI", "Pris: 1000\n Rent: 150", "Køb en by");
		
		territories[2] = new Territory(200, 1500, 3, "JERUSALEM", "Pris: 1500\n Rent: 200", "Køb en by");
		territories[3] = new Territory(300, 1500, 4, "BAGHDAD", "Pris: 1500\n Rent: 300", "Køb en by");
		territories[4] = new Territory(500, 1500, 5, "KABUL", "Pris: 1500\n Rent: 500", "Køb en by");
		
		territories[5] = new Territory(700, 2000, 6, "MOSCOW", "Pris: 2000\n Rent: 700", "Køb en by");
		territories[6] = new Territory(850, 2000, 7, "NEW DELHI", "Pris: 2000\n Rent: 850", "Køb en by");
		territories[7] = new Territory(1050, 2000, 8, "BEIJING", "Pris: 2000\n Rent: 1050", "Køb en by");
		
		territories[8] = new Territory(1200, 2500, 9, "TOKYO", "Pris: 2500\n Rent: 1200", "Køb en by");
		territories[9] = new Territory(1350, 2500, 10, "SINGAPORE", "Pris: 2500\n Rent: 1350", "Køb en by");
		territories[10] = new Territory(1400, 2500, 11, "SYDNEY", "Pris: 2500\n Rent: 1400", "Køb en by");
		
		territories[11] = new Territory(1500, 3000, 12, "BUENOS AIRES", "Pris: 3000\n Rent: 1500", "Køb en by");
	
		refuges[0] = new Refuge(5000, 13, "NATIONAL BANKEN", "Modtag 5000,-", "Du har vundet. Tillykke!");
		refuges[1] = new Refuge(500, 14, "DANSKE SPIL", "Modtag 500,-", "Du har vundet. Tillykke!");
		
		laborCamps[0] = new Laborcamp(100, 2500, 15, "SHANGHAI HAVN", "Pris: 2500", "Køb en havn");
		laborCamps[1] = new Laborcamp(100, 2500, 16, "HAMBURG HAVN	", "Pris: 2500", "Køb en havn");
		laborCamps[2] = new Laborcamp(100, 2500, 17, "SHENZEN HAVN", "Pris: 2500", "Køb en havn");
		
		taxes[0] = new Tax(2000, 18, "INDKOMST SKAT", "Betal 2000,- eller 10%", "Betal din indkomstskat!");
		taxes[1] = new Tax(4000, 19, "INDKOMST SKAT", "Betal 2000,- eller 10%", "Betal din indkomstskat!");
		
		fleets[0] = new Fleet(4000, 20, "SYDNEY LUFTHAVN", "Pris: 4000", "Køb en lufthavn");
		fleets[1] = new Fleet(4000, 21, "KØBENHAVNS LUFTHAVN", "Pris: 4000", "Køb en lufthavn");
		fleets[2] = new Fleet(4000, 22, "BANGKOK LUFTHAVN", "Pris: 4000", "Køb en lufthavn");
		fleets[3] = new Fleet(4000, 23, "HAWAII LUFTHAVN", "Pris: 4000", "Køb en lufthavn");
		
		territories[12] = new Territory(1600, 3500, 24, "ABU DHABI", "Pris: 3500\n Rent: 1600", "Køb en by");
		territories[13] = new Territory(1750, 3500, 25, "LAS VEGAS", "Pris: 3500\n Rent: 1750", "Køb en by");
		
		territories[14] = new Territory(450, 1250, 26, "WASHINGTON D.C", "Pris: 1250\n Rent: 450", "Køb en by");
		territories[15] = new Territory(400, 1250, 27, "NEW YORK", "Pris: 1250\n Rent: 400", "Køb en by");
		territories[16] = new Territory(325, 1250, 28, "NUUK", "Pris: 1250\n Rent: 325", "Køb en by");
		
		territories[17] = new Territory(650, 1750, 29, "LONDON", "Pris: 1750\n Rent: 650", "Køb en by");
		territories[18] = new Territory(550, 1750, 30, "PARIS", "Pris: 1750\n Rent: 550", "Køb en by");
		territories[19] = new Territory(500, 1750, 31, "BERLIN", "Pris: 1750\n Rent: 500", "Køb en by");
		
		territories[20] = new Territory(1500, 2250, 32, "LUXEMBOURG", "Pris: 2250\n Rent: 1500", "Køb en by");
		territories[21] = new Territory(1700, 2250, 33, "STOCKHOLM", "Pris: 2250\n Rent: 1700", "Køb en by");
		
		territories[22] = new Territory(2750, 2750, 34, "OSLO", "Pris: 2750\n Rent: 2750", "Køb en by");
		territories[23] = new Territory(2750, 2750, 35, "FRANKFURT", "Pris: 2750\n Rent: 2750", "Køb en by");
		territories[24] = new Territory(2750, 2750, 36, "LOS ANGELES", "Pris: 2750\n Rent: 2750", "Køb en by");
		territories[25] = new Territory(2750, 2750, 37, "HONG KONG", "Pris: 2750\n Rent: 2750", "Køb en by");
		
		territories[26] = new Territory(2750, 3250, 38, "HELSINKI", "Pris: 3250\n Rent: 2750", "Køb en by");
		territories[27] = new Territory(2750, 3250, 39, "REYKJAVIK", "Pris: 3250\n Rent: 2750", "Køb en by");


	}

	public Felt getField(int field) {
		for(int i = 0; i < TYPES; i++) {
			for(int j = 0; j < board[i].length; j++) {
				if(board[i][j].getFelt() == field)
					return board[i][j];
			}
		}
		return null;
	}
	
	public Ownable[][] getOwnables() {
		return ownables;
	}
}