public class zubat extends Pokemon{
    public zubat (String name){
        super(name);
        HP=(int)(Math.random()*1500);
        LV=(int)(Math.random()*10);
        
    }
    public void attack (Pokemon enemy){
        System.out.println("Pokemon "+ name +" attack " + enemy.getName());
        
        }
}