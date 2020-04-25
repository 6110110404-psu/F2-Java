/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jvava.pokemon;

abstract class Pokemon{
	public final double maxHealth;
	protected double health,weight;
	protected String name;
	protected PokemonSkill attackSkill;
	protected PokemonSkill untimatedSkill;

	public Pokemon(String name, double maxHealth,double weight){
		this.name = name;
		this.health = maxHealth;
		this.maxHealth = maxHealth;
                this.weight= weight;
	}

	public double getHealth(){
		return this.health;
	}

	public String getName(){
		return this.name;
	}
        public double getWeight(){
		return this.weight;
	}
	
	public void eat(Berry berry){
		this.health += berry.getRestoreValue();
		if(this.health > this.maxHealth)
			this.health = this.maxHealth;
                this.weight += berry.getRestoreValue()/10;
	}

	public void attack(Pokemon rival){
		rival.injure(this.attackSkill);
	}

	public void untimate(Pokemon rival){
		rival.injure(this.untimatedSkill);
	}

	public void injure(PokemonSkill skill){
		this.reducedHealth(skill.getDamage());
	}
        public double revive () {
              return this.health = this.maxHealth;
        }
        
	public void reducedHealth(double value){
		this.health -= value;
		if(this.health <0)
			this.health = 0;
	}
        
        public void reducedWeight(double value){
		this.weight -= value/10;
		if(this.weight <1)
			this.weight = 1;
	}

	abstract public void move();

}
