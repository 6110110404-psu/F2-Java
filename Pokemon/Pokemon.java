
public abstract class Pokemon {

	protected String name;
    protected int HP=0;
    protected int LV=0;
    protected String gender;
    protected String element;
    

    public Pokemon (String name){
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
        
        int sex = (int)(Math.random()*2);
        if (sex == 0){
            gender = "Male";
        }
        else if(sex == 1){
            gender = "Female";
        }
        
        this.name = name;
    }
    public String getName(){
        return name;
    }
    public int getHp(){
        return HP;
    }
    public void setHp(int HP){
        this.HP = HP;
      
    }
    
    public int getLv(){
        return LV;
    }
    public void setLv(int LV){
        this.LV = LV;
    }
    
    public String getGender() {
        return this.gender;
    }
    public  String getEle() {
   	
    	return this.element;
    	
    }

    public void setEle(String element){
        this.element = element;
    }
        
    public abstract void attack (Pokemon enemy);
    public String toString(){
        return name;
    }
   
   
}

