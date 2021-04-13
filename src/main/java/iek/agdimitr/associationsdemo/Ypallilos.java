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
public class Ypallilos {
	private Atomo atomo;
	private String eidikotita;

	public Ypallilos(Atomo atomo, String eidikotita) {
		this.atomo = atomo;
		this.eidikotita = eidikotita;
	}

	public String toString() {
		return ("ypallilos: " + atomo + "   Eidkotita: " + eidikotita);
	}
}
