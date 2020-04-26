
public class nullBerry extends Berry{

	public nullBerry() {
		super("Null Berry");
		
	}
public void useBerry(Pokemon pokemon) {
		
		String element = pokemon.getEle();
		int alchemy = (int)(Math.random()*5);
    	if(alchemy==0) {
    		element="FIRE";
    	}
    	else if(alchemy==1) {
    		element="WATER";
    	}
    	else if(alchemy==2) {
    		element="DARK";
    	}
    	
    	else if(alchemy==3) {
    		element="ROCK";
    	}
    	
    	else if(alchemy==4) {
    		element="GRASS";
    	}
		
		pokemon.setEle(element);
		
	}
}
