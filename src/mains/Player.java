package mains;

import chracters.character;
import location.location;
import location.safehouse;

public class Player {


    public static Player player;
    public inventory player_Inventory=new inventory();
    String name;
    character player_Character;
    location location;

    public Player(String name, location location) {
        
        this.name = name;
        this.location = new safehouse();
    }

    public inventory getPlayer_Inventory() {
        return player_Inventory;
    }

    public void setPlayer_Inventory(inventory player_Inventory) {
        this.player_Inventory = player_Inventory;
    }

    public character getPlayer_Character() {
        return player_Character;
    }

    public void setPlayer_Character(character player_Character) {
        this.player_Character = player_Character;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {

        return player_Character.getName();

    }

}
