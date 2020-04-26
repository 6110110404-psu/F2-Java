/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jvava.pokemon;

public class Pikachu extends Pokemon implements Walkable{
	private static final int maxGroupHealth = 200;
	public Pikachu(){
		super("Pikachu",
		     ( (Math.random()*1000) % (maxGroupHealth))+50,(Math.random()*1000)%50);
                      
		this.attackSkill = PokemonSkill.getPokemonSkill("Thunder Shock");
		this.untimatedSkill = PokemonSkill.getPokemonSkill("Thunderbolt");
	}

	public void move(){
		this.run();
	}

	public void run(){
		this.reducedWeight(10);
	}

	public void walk(){
		this.reducedWeight(1);
	}
}
