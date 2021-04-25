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
public class IX extends Oxima{
    private String eidos;
    private int arThesewn;
    
IX(String arKykloforias, String marka, String eidos, int arThesewn) {
		super(arKykloforias, marka);
		this.eidos = eidos;
		this.arThesewn = arThesewn;
	}

	public String toString() {
		return (super.toString() + " einai " + 
                        eidos + " thesewn " + arThesewn);
	}
}
