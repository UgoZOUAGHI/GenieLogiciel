package myPackage;

public class Compte {
	
	private double solde;
	
	public Compte() {
		solde = 0;
	}
	
	public Compte(double value) {
		solde = value;
	}
	
	public double getSolde() {
		return solde;
	}
	
	public void setSolde(double value) {
		solde = value;
	}
}
