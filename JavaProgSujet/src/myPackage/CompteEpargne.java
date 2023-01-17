package myPackage;

public class CompteEpargne extends Compte {

	public CompteEpargne(double value) {
		super(value);
	}

	public void add(double value) {
		super.setSolde(super.getSolde() + value);
	}

}
