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

import java.util.Vector;

public class Xenodoxeio {
	private String epwnymia;
	private Vector <Ypallilos> proswpiko;  // πίνακας-αναφορά

	public Xenodoxeio(String epwnymia) {
		this.epwnymia = epwnymia;
                       //Αρχικοποιούμε το vector
                       proswpiko = new Vector<Ypallilos>();
	}

	public void addYpallilos(Ypallilos yp) {
		// AGGREGAION: προσθέτουμε τους Υπαλλήλους
		proswpiko.add(yp);
	}

	public String getEpwnymia()  {
		return epwnymia;
	}

	public void printProswpiko() {
		System.out.println("\nTa proswpiko tou Xenodoxeiou");
		if ( proswpiko.isEmpty() )
        	                   System.out.println( "Μήνυμα λάθους." );
    	            else 
    	                       for ( Ypallilos element : proswpiko )
        	                             System.out.printf( "%s\n", element.toString() );
             }
}
