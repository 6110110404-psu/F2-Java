/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jvava.pokemon;

public class Rattata extends Pokemon implements Walkable{
	private static final int maxGroupHealth = 200;
	public Rattata(){
		super("Rattata",
		      ( (Math.random()*1000) % (maxGroupHealth))+50,(Math.random()*1000)%40);

		this.attackSkill = PokemonSkill.getPokemonSkill("Bite");
		this.untimatedSkill = PokemonSkill.getPokemonSkill("Rider Kick");
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
