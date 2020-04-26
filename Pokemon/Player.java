import java.util.ArrayList;

//import sun.security.ec.point.Point;

import java.util.*;

public class Player {
    ArrayList<Pokemon> bag;
    private Scanner s;
    private String name;
    private int point=0;
    
    public Player(String name,int point){
        bag=new ArrayList<Pokemon>();
        bag.add(new Seel("Seel"));
        bag.add(new zubat("Zubat"));
        s=new Scanner(System.in);
        this.name = name;
        this.point = point;
    }

    public int getPoint() {
    	return this.point;
    }
    
    public void IncreasePoint(int point) {
    	this.point+=point;
    }
    
    public String getPlname(){
        return name;
    }
    
    public void showPokemon(ArrayList<Pokemon> bag){
        int number=0;
        for(Pokemon p: bag){
            System.out.println("HP:"+p.getHp());
            number++;
        }
    }
    public ArrayList<Pokemon> getBag(){
        return bag;
    }

}