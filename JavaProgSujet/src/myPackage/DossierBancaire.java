package myPackage;

public class DossierBancaire {

	public static double taux = 3.2/100;
	public static double pourcentage_compte_epargne = 0.6; // Taux � verser sur le Compte Epargne
	public static double pourcentage_compte_courant = 1 - pourcentage_compte_epargne; // Taux � verser sur le Compte Courant

	private CompteCourant Compte_Courant; 
	private CompteEpargne Compte_Epargne;

///<<<<<<< HEAD
///=======
	public DossierBancaire() //constructeur sans solde initial
	{
		Compte_Courant = new CompteCourant(0.0);
		Compte_Epargne = new CompteEpargne(0.0);
///>>>>>>> refs/heads/new_dev
	}

	public DossierBancaire(double val) { // Versement initial si il y a de l'argent lors de la cr�ation du dossier bancaire
		Compte_Courant = new CompteCourant(val * pourcentage_compte_courant);
		Compte_Epargne = new CompteEpargne(val * pourcentage_compte_epargne);
	}

	public void deposer(double value) {
		Compte_Courant.add(value * pourcentage_compte_courant);
		Compte_Epargne.add(value * pourcentage_compte_epargne);
	}

	public double getSolde() {	// obtenir le solde total du dossier bancaire
		return Compte_Courant.getSolde() + Compte_Epargne.getSolde();
	}

	public double getSolde_CompteCourant() {// obtenir le solde du compte courant
		return Compte_Courant.getSolde();
	}

	public double getSolde_CompteEpargne() {// obtenir le solde du compte epargne
		return Compte_Epargne.getSolde();
	}

	public void remunerer() {//ajout sur le compte epargne
		Compte_Epargne.add(Compte_Epargne.getSolde() * taux);								
	}
	
	public void retirer(double val) throws Exception {//retirer argent
		if(this.getSolde() - val < 0) throw new Exception("T'es pauvre mon gars !");
		else Compte_Courant.add(-val);
	}
}
