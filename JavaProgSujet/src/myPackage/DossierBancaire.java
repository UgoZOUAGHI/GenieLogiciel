package myPackage;

public class DossierBancaire {

	public static double taux = 3.2/100;
	public static double pourcentage_compte_epargne = 0.6; // Taux � verser sur le Compte Epargne
	public static double pourcentage_compte_courant = 1 - pourcentage_compte_epargne; // Taux � verser sur le Compte Courant

	private CompteCourant Compte_Courant; 
	private CompteEpargne Compte_Epargne;

	public DossierBancaire() {
		Compte_Courant = new CompteCourant(0.0);//nouveau compte courant
		Compte_Epargne = new CompteEpargne(0.0);//nouveau compte epargne
	}

	public DossierBancaire(double val) { // Versement initial si il y a de l'argent lors de la cr�ation du dossier bancaire
		Compte_Courant = new CompteCourant(val * pourcentage_compte_courant);
		Compte_Epargne = new CompteEpargne(val * pourcentage_compte_epargne);
	}

	public void deposer(double value) {
		Compte_Courant.add(value * pourcentage_compte_courant);
		Compte_Epargne.add(value * pourcentage_compte_epargne);
	}

	public double getSolde() {	
		return Compte_Courant.getSolde() + Compte_Epargne.getSolde();
	}

	public double getSolde_CompteCourant() {
		return Compte_Courant.getSolde();
	}

	public double getSolde_CompteEpargne() {
		return Compte_Epargne.getSolde();
	}

	public void remunerer() {
		Compte_Epargne.add(Compte_Epargne.getSolde() * taux);								
	}
	
	public void retirer(double val) throws Exception {
		if(this.getSolde() - val < 0) throw new Exception("T'es pauvre mon gars !");
		else Compte_Courant.add(-val);
	}
}
