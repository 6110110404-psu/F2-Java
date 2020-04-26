/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jvava.pokemon;

public class Seel extends Pokemon implements Swimmable{
	private static final int maxGroupHealth = 250;
	public Seel(){
		super("Seel",
		      ( (Math.random()*1000) % (maxGroupHealth))+50,(Math.random()*1000)%100);

		this.attackSkill = PokemonSkill.getPokemonSkill("Tail Whip");
		this.untimatedSkill = PokemonSkill.getPokemonSkill("Water Pulse");
	}

	public void move(){
		this.swim();
	}

	public void swim(){
		this.reducedWeight(10);
	}	}

