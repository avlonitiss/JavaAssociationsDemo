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
public class Inheritance_Demo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Atomo atomo1 = new Atomo("Varthakouris Ioannis", "33133");
		IX ix1 = new IX("ΑΒΓ-1234", "Alfa Romeo", "IX 2-thyro", 4);

		ix1.setIdioktitis(atomo1);
		System.out.println(ix1);
	 }
}

