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
public abstract class Oxima {
    private String arKykloforias;
	private String marka;
	private Atomo idioktitis;
	
	Oxima(String arKykloforias, String marka) {
		this.arKykloforias = arKykloforias;
		this.marka = marka;
	}

	public String getArKykloforias()  {
		return arKykloforias;
	}
	
	public String getMarka()  {
		return marka;
	}
	
	public void setIdioktitis(Atomo idiokt)  {
		this.idioktitis = idiokt;
	}
	
	public String toString() {
		return ("to autikinito me ar. kykloforias " + arKykloforias + 
		" einai " + marka + " anikei sto/in " + idioktitis);
	}

}

