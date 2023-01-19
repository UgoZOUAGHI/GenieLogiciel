package tests;

import static org.junit.Assert.*;

import org.junit.Test;

import myPackage.DossierBancaire;
import myPackage.CompteCourant;
import myPackage.CompteEpargne;

public class TestDossierBancaire {

	@Test  
	public void test1_1() 
	{
		DossierBancaire dossier=new DossierBancaire();
		assertEquals(0,dossier.getSolde(),0); 
		dossier.deposer(100);
		assertEquals(100,dossier.getSolde(),0); //voir documentation en ligne sur assertions Junit 
	}
	
	@Test
	public void test1_2()
	{
		CompteCourant compteC=new CompteCourant(0);
		assertEquals(0,compteC.getSolde(),0); 
		compteC.add(100);
		assertEquals(100,compteC.getSolde(),0);
	}
	
	@Test
	public void test1_3() {
		CompteEpargne compteE=new CompteEpargne(0);
		assertEquals(0,compteE.getSolde(),0); 
		compteE.add(100);
		assertEquals(100,compteE.getSolde(),0);
	}
	@Test
	public void test1_4() throws Exception//retrait
	{
		DossierBancaire Db= new DossierBancaire();
		assertEquals(0,Db.getSolde(),0); 
		Db.deposer(100);
		assertEquals(100,Db.getSolde(),0);
		Db.retirer(20);
		assertEquals(80,Db.getSolde(),0);
		try {
			Db.retirer(600); // Exception vérifiée ! 
			fail("Possible de retirer plus que la normale");
		}catch(Exception e) {}
		
	}
	
}
