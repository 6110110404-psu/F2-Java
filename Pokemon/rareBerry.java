
public class rareBerry extends Berry {

	public rareBerry() {
	super("Rare Berry");
		
		
	} 
	public void useBerry(Pokemon pokemon) {
		
		//int hp = pokemon.getHp()+15;
		int lv =pokemon.getLv()+10;
	
		//pokemon.setHp(hp);
		pokemon.setLv(lv);
		
	}
	

}