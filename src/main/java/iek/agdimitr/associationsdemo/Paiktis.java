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
public class Paiktis {
	private Atomo atomo;
	private String katigoria;

	public Paiktis(Atomo atomo, String katigoria) {
		this.atomo = atomo;
		this.katigoria = katigoria;
	}

	public String toString() {
		return ("paiktis: " + atomo + "   katigoria: " + katigoria);
	}
}
