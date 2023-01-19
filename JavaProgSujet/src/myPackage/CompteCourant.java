package myPackage;

public class CompteCourant extends Compte {

	public CompteCourant(double value) {
		super(value);
	}

	public void add(double value) {
		super.setSolde(super.getSolde() + value);
	}
	
	public double getSolde() {
		return super.getSolde();
	} 

}