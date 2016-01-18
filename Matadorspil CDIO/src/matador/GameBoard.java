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
		territories[0] = new Territory(100, 1000, 1, "RABAT", "Price: 1000\nRent: 100", "Buy a tribe");
		territories[1] = new Territory(300, 1500, 2, "NAIROBI", "Price: 1500\nRent: 300", "Buy a hole");
		
		territories[2] = new Territory(500, 2000, 3, "JERUSALEM", "Price: 2000\nRent: 500", "Buy a rock");
		territories[3] = new Territory(700, 3000, 4, "BAGHDAD", "Price: 3000\nRent: 700", "Buy cold sand");
		territories[4] = new Territory(1000, 4000, 5, "KABUL", "Price: 4000\nRent: 1000", "Buy dark rock");
		
		territories[5] = new Territory(1300, 4300, 6, "MOSCOW", "Price: 4300\nRent: 1300", "Buy a wall");
		territories[6] = new Territory(1600, 4750, 7, "NEW DELHI", "Price: 4750\nRent: 1600", "Buy a village on a rock");
		territories[7] = new Territory(2000, 5000, 8, "BEIJING", "Price: 5000\nRent: 2000", "Buy a citadel");
		
		territories[8] = new Territory(2600, 5500, 9, "TOKYO", "Price: 5500\nRent: 2600", "Buy a palace");
		territories[9] = new Territory(3200, 6000, 10, "SINGAPORE", "Price: 6000\nRent: 3200", "Buy a tower");
		territories[10] = new Territory(4000, 8000, 11, "SYDNEY", "Price: 8000\nRent: 4000", "Buy a castle");
		
		territories[11] = new Territory(4000, 8000, 12, "BUENOS AIRES", "Price: 8000\nRent: 4000", "Buy a castle");
	
		refuges[0] = new Refuge(5000, 13, "NATIONAL BANKEN", "5000 free money", "Walls keep you safe");
		refuges[1] = new Refuge(500, 14, "DANSKE SPIL", "500 free money", "Bigger walls");
		
		laborCamps[0] = new Laborcamp(100, 2500, 15, "SHANGHAI HAVN", "Price: 2500", "Pay 100x diceroll for each camp\nthe owner has");
		laborCamps[1] = new Laborcamp(100, 2500, 16, "HAMBURG HAVN	", "Price: 2500", "Pay 100x diceroll for each camp\nthe owner has");
		laborCamps[2] = new Laborcamp(100, 2500, 17, "SHENZEN HAVN", "Price: 2500", "Pay 100x diceroll for each camp\nthe owner has");
		
		taxes[0] = new Tax(2000, 18, "INDKOMST SKAT", "Pay 2000 or\n10% of your money", "Gold tax?");
		taxes[1] = new Tax(4000, 19, "INDKOMST SKAT", "Pay 2000 or\n10% of your money", "Regular holdup");
		
		fleets[0] = new Fleet(4000, 20, "SYDNEY LUFTHAVN", "Price: 4000", "pay depending on the amount of fleets\nthe owner has");
		fleets[1] = new Fleet(4000, 21, "KØBENHAVNS LUFTHAVN", "Price: 4000", "pay depending on the amount of fleets\nthe owner has");
		fleets[2] = new Fleet(4000, 22, "BANGKOK LUFTHAVN", "Price: 4000", "pay depending on the amount of fleets\nthe owner has");
		fleets[3] = new Fleet(4000, 23, "HAWAII LUFTHAVN", "Price: 4000", "pay depending on the amount of fleets\nthe owner has");
		
		territories[12] = new Territory(4000, 8000, 24, "ABU DHABI", "Price: 8000\nRent: 4000", "Buy a castle");
		territories[13] = new Territory(4000, 8000, 25, "LAS VEGAS", "Price: 8000\nRent: 4000", "Buy a castle");
		
		territories[14] = new Territory(4000, 8000, 26, "WASHINGTON D.C", "Price: 8000\nRent: 4000", "Buy a castle");
		territories[15] = new Territory(4000, 8000, 27, "NEW YORK", "Price: 8000\nRent: 4000", "Buy a castle");
		territories[16] = new Territory(4000, 8000, 28, "NUUK", "Price: 8000\nRent: 4000", "Buy a castle");
		
		territories[17] = new Territory(4000, 8000, 29, "LONDON", "Price: 8000\nRent: 4000", "Buy a castle");
		territories[18] = new Territory(4000, 8000, 30, "PARIS", "Price: 8000\nRent: 4000", "Buy a castle");
		territories[19] = new Territory(4000, 8000, 31, "BERLIN", "Price: 8000\nRent: 4000", "Buy a castle");
		
		territories[20] = new Territory(4000, 8000, 32, "LUXEMBOURG", "Price: 8000\nRent: 4000", "Buy a castle");
		territories[21] = new Territory(4000, 8000, 33, "STOCKHOLM", "Price: 8000\nRent: 4000", "Buy a castle");
		
		territories[22] = new Territory(4000, 8000, 34, "OSLO", "Price: 8000\nRent: 4000", "Buy a castle");
		territories[23] = new Territory(4000, 8000, 35, "FRANKFURT", "Price: 8000\nRent: 4000", "Buy a castle");
		territories[24] = new Territory(4000, 8000, 36, "LOS ANGELES", "Price: 8000\nRent: 4000", "Buy a castle");
		territories[25] = new Territory(4000, 8000, 37, "HONG KONG", "Price: 8000\nRent: 4000", "Buy a castle");
		
		territories[26] = new Territory(4000, 8000, 38, "HELSINKI", "Price: 8000\nRent: 4000", "Buy a castle");
		territories[27] = new Territory(4000, 8000, 39, "REYKJAVIK", "Price: 8000\nRent: 4000", "Buy a castle");
		territories[28] = new Territory(4000, 8000, 40, "AMSTERDAM", "Price: 8000\nRent: 4000", "Buy a castle");

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