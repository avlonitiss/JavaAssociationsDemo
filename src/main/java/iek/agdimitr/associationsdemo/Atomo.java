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
public class Atomo {
	private String onoma;
	private String tilephono;

	public Atomo(String onoma, String tilephono) {
		this.onoma = onoma;
		this.tilephono = tilephono;
	}
	
	public void setKinito(String tilephono) {
		this.tilephono = tilephono;
	}

	public String toString()  {
		return (onoma + " thl. " + tilephono);
	}
}
