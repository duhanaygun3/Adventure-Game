package chracters;

import mains.Game;
import mains.Player;

public class character {
   public static  character[] characters={new samuray(),new archer(),new chivalry()};

    static{
        // characters=new character[3];
        // characters[0]=new samuray();
        // characters[1]=new archer();
        // characters[2]=new chivalry();

    }

    String name;
    int id, healthy, damage, money;

    public character(int id, String name, int damage, int healthy, int money) {
        setId(id);
        setName(name);
        setDamage(damage);
        setHealthy(healthy);
        setMoney(money);
    }


    public static void listCharecters(){
        
        
        
        for(character chrs: characters){
            System.out.println(chrs.getId()+" -)"+chrs.getName()+" Damage: "+chrs.getDamage()+" Healthy: "+chrs.getHealthy()+" Money: "+chrs.getMoney());

        }
        
    }

    public static character charSelect(int selected,Player player){
       
        player.setPlayer_Character(characters[selected]);
        
return characters[selected];
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getHealthy() {
        return healthy;
    }

    public void setHealthy(int healthy) {
        this.healthy = healthy;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }
@Override 
    public String toString(){

        
        return "Name:"+getName()+" Damage:"+getDamage()+" Healthy:"+getHealthy()+" Money:"+getMoney();

    }

}
