package armor;

import java.util.Scanner;

import mains.Game;
import mains.Player;

public class armor {
    String name;

    boolean isActive = true;
    int id,reduction,money;
    public static armor[] armors = { new ligth_armor(), new mid_armor(), new heavy_armor() };

    

    

    public armor(String name, int id, int reduction, int money) {
        setName(name);
        setId(id);
        setMoney(money);
        setReduction(reduction);
    }

    public static void armorList() {
        System.out.println("ARMORS\n-------------------\n");

        for (armor arm : armors) {
            if (arm.isActive)
                System.out.println(arm.id + "-)" + arm.name + "\t" + arm.reduction + "\t" + arm.money);

        }

    }

    public static void armorBuy() {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Seçim yapiniz!\nMevcut money:"+Player.player.getPlayer_Character().getMoney());
        int selection=scanner.nextInt();
        
        if(Player.player.getPlayer_Character().getMoney()>=armors[selection-1].money){
            System.out.println("Satin aldiniz:"+armors[selection-1].getName());
            armors[selection-1].setActive(false);
            for(int i=0;i<armors.length;i++){
                if(i==(selection-1)){

                }
                else{
                    armors[i].setActive(true);
                }
            }


            
            // Player.player.getPlayer_Inventory().setArmor(armors[selection-1]);
            // Player.player.player_Inventory.setArmor(armors[selection-1]);
            Game.player.player_Inventory.setArmor(armors[selection-1]);

            System.out.println("Mevcut hasar engelleme: "+Game.player.getPlayer_Inventory().getArmor().getReduction());

            
            

        }

        else{
            System.out.println("Yeterli Paraniz bulunmamaktadir\n---------------------------------");
        }

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getReduction() {
        return reduction;
    }

    public void setReduction(int reduction) {
        this.reduction = reduction;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isActive() {
        return isActive;
    }

    public void setActive(boolean isActive) {
        this.isActive = isActive;
    }

}
