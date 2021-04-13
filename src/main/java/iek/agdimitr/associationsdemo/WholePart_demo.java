/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package iek.agdimitr.associationsdemo;

/**
 *
 * @author User
 */
class WholePart_Demo {

	public static void main(String[] argv) {

		Xenodoxeio x = new Xenodoxeio("Akropolis");
		// x.printDwmatia();

		Atomo at1 = new Atomo("Dimitriou", "6945777444");
		Ypallilos yp1 = new Ypallilos(at1, "Mageiras");
		x.addYpallilos(yp1);
		
		Atomo at2 = new Atomo("Xeimwnidis", "6967888222");
		Ypallilos yp2 = new Ypallilos(at2, "Logistis");
		x.addYpallilos(yp2);
		
		// Emfanizei to proswpiko
		x.printProswpiko();
		
		// Dimiourgeitai h Omada
		AthlitikosSyllogos apollwn = new AthlitikosSyllogos("APOLLWN");
		Paiktis p1 = new Paiktis(at2, "Termatofylakas");
		apollwn.addPaiktis(p1);

		// Emfanizei thn Omada
		apollwn.printSyllogos();
		
		// o Xeimwnidis allazei arithmo tilephonou
		at2.setKinito("6944333000");
		
		// Emfanisi meta thn allagi stoixeiwn toy Xeimwnidi 
		System.out.println("\n\nEmfanisi meta thn allagi stoixeiwn toy Xeimwnidi");
		x.printProswpiko();
		apollwn.printSyllogos();
	}
}

