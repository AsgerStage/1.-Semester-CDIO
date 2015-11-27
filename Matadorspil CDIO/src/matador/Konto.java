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
	
	public void inds�t(int kr) {
		konto += kr;
	}
	
	public void h�v(int kr) {
		konto -= kr;
	}
	

	
	public String toString() {
		return "" + konto;
	}
}
