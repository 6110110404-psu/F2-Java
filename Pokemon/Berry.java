
public abstract class Berry {
	
	private String nameberry;
    
    public Berry(String nameberry){
        this.nameberry=nameberry;
        
    }  
    public String getberry() {
        return nameberry;
    }
    
  
    public abstract void useBerry(Pokemon pokemon);

}

