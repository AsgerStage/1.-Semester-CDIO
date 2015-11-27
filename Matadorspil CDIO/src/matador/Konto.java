package matador;



public class Konto {
	private int konto;
	
	public Konto() {
		konto = 30000;
	}
	
	public Konto(int konto) {
		this.konto = konto;
	}
	
	public void setBalance(int konto) {
		this.konto = konto;
		if(this.konto < 0)
			this.konto = 0;
	}
	
	public int getKonto()
	{
		return konto;
	}
	
	public void indsæt(int kr) {
		konto += kr;
	}
	
	public void hæv(int kr) {
		konto -= kr;
	}
	

	
	public String toString() {
		return "" + konto;
	}
}
