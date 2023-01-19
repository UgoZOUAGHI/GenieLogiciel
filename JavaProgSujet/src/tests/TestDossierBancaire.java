package tests;

import static org.junit.Assert.*;

import org.junit.Test;

import myPackage.DossierBancaire;

public class TestDossierBancaire {

	@Test  
	public void test1_1() 
	{
		DossierBancaire dossier=new DossierBancaire();
		assertEquals(0,dossier.getSolde(),0); 
		dossier.deposer(100);
		assertEquals(100,dossier.getSolde(),0); //voir documentation en ligne sur assertions Junit 
	}

}
