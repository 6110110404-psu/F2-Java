
public class mixBerry extends Berry {

	public mixBerry() {
		super("Mix Berry");
		
	} 
	public void useBerry(Pokemon pokemon) {
		int hp = pokemon.getHp()+10;
		pokemon.setHp(hp);
		
	}
	

}
