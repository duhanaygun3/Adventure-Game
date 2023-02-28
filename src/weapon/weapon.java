package weapon;

import java.util.Scanner;

import mains.Game;
import mains.Player;

public class weapon {
    String name;
    int id,damage,money;
    boolean isActive = true;

    
    public static weapon[] weapons={new gun(),new sword(),new rifle()};


    
    public weapon(String name, int id, int damage, int money) {
        setId(id);
        setName(name);
        setDamage(damage);
        setPara(money);
    }

    public static void weaponList() {
        System.out.println("ARMORS\n-------------------\n");

        for (weapon weapon : weapons) {
            if (weapon.isActive)
                System.out.println(weapon.id + "-)" + weapon.name + "\t" + weapon.damage + "\t" + weapon.money);

        }

    }

    public static void weaponBuy() {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Seçim yapiniz!\nMevcut money:"+Player.player.getPlayer_Character().getMoney());
        int selection=scanner.nextInt();
        
        if(Player.player.getPlayer_Character().getMoney()>=weapons[selection-1].money){
            System.out.println("Satin aldiniz:"+weapons[selection-1].getName());
            weapons[selection-1].setActive(false);
            for(int i=0;i<weapons.length;i++){
                if(i==(selection-1)){

                }
                else{
                    weapons[i].setActive(true);
                }
            }


            
            // Player.player.getPlayer_Inventory().setArmor(armors[selection-1]);
            // Player.player.player_Inventory.setArmor(armors[selection-1]);
            Game.player.player_Inventory.setWeapons(weapons[selection-1]);

            System.out.println("Mevcut hasar : "+(Game.player.getPlayer_Character().getDamage()+Game.player.getPlayer_Inventory().getWeapons().getDamage()));

            
            

        }

        else{
            System.out.println("Yeterli Paraniz bulunmamaktadir\n---------------------------------");
        }

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
    public int getDamage() {
        return damage;
    }
    public void setDamage(int damage) {
        this.damage = damage;
    }
    public int getPara() {
        return money;
    }
    public void setPara(int para) {
        this.money = para;
    }

    public boolean isActive() {
        return isActive;
    }

    public void setActive(boolean isActive) {
        this.isActive = isActive;
    }

    
}
