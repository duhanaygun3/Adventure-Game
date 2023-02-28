package location;

import java.util.Scanner;

import armor.armor;
import mains.Game;
import weapon.weapon;

public class toolstore extends normal_loc{
    Scanner scanner=new Scanner(System.in);



    

    @Override
    public boolean onLocation(boolean bool) {
        System.out.println("Welcome to Shop");

        shopItems();
        
        
        return false;
    }

    public void shopItems(){
        int shopSelection;
        System.out.println("---------------------------");
        System.out.println("Kategori seçiniz:");
        System.out.println("1-)Armors\n2-)Weapons");
        shopSelection=scanner.nextInt();

        switch (shopSelection) {
            case 1:
            armor.armorList();
            armor.armorBuy();
                
                break;
        
            case 2:
            weapon.weaponList();
            weapon.weaponBuy();

            break;
        }


        


    }
    
}
