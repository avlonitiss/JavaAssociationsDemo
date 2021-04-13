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

public class AthlitikosSyllogos {
	private String epwnymia;
	private Vector<Paiktis> paiktes;   

	public AthlitikosSyllogos(String epwnymia) {
		this.epwnymia = epwnymia;
                        paiktes = new Vector<Paiktis>();
	}

	public String getEpwnymia()  {
		return epwnymia;
	}
	
	public void addPaiktis(Paiktis paiktis) {
		// AGGREGAION: prosthetoyme atoma - paiktes stin Omada
		paiktes.add(paiktis);
	}

	public void printSyllogos() {
		System.out.println("\nAthlitikos syllogos: " + epwnymia);
		System.out.println("--------------------------------------");
		if ( paiktes.isEmpty() ) 
        	System.out.println( "..........." );
    	else  
    	for ( Paiktis element : paiktes )
        	System.out.printf( "%s\n", element.toString() );
  }
}
