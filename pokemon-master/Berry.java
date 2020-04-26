/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jvava.pokemon;

public class Berry{
	private String name;
	private float restoreValue;
	private int type;

	public Berry(int type){
		this.type = type;
		switch(type){
			case 0: this.name = "Berry";
				this.restoreValue = 10;
				break;
			case 1: this.name = "GoldBerry";
				this.restoreValue = 30;
				break;
			case 2: this.name = "MysteryBerry";
				this.restoreValue = 100;
				break;
		}

	}

    Berry() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

	public String getName(){
		return this.name;
	}

	public float getRestoreValue(){
		return this.restoreValue;
	}
}

