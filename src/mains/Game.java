package mains;

import java.util.Scanner;

import chracters.character;
import location.cave;
import location.forest;
import location.location;
import location.river;
import location.safehouse;
import location.toolstore;

public class Game {
    public static location curentlLocation;
    public static character choosen;
    public static Player  player;
    location locations[] = {
            (new safehouse()),
            (new toolstore()),
            (new forest()),
            (new cave()),
            (new river())

    };

    Scanner scanner = new Scanner(System.in);

    

    public Game(Player player) {
        
       setPlayer(player);
       Player.player=getPlayer();
    //    oyunun döneceği loccation ataması 
       // Game.curentlLocation=curentlLocation;
       

        System.out.println(player.getName() + " Welcome to game.\nSelect a Character:");

        character.listCharecters();

        
        // player.setPlayer_Character(character.characters[scanner.nextInt()-1]);
        character.charSelect(scanner.nextInt() - 1, player);
        player.setPlayer_Character(player.getPlayer_Character());
        choosen = player.getPlayer_Character();

       }

    public void start() {

        // System.out.println(player.getName() + " Welcome to game.\nSelect a Character:");

        // character.listCharecters();

        // // player.setPlayer_Character(character.characters[scanner.nextInt()-1]);
        // character.charSelect(scanner.nextInt() - 1, player);
        // choosen = player.getPlayer_Character();

        System.out.println("Charecter selected !\n" + player.getPlayer_Character().toString());

       

        while (true) {
            menuSelect(getPlayer());

        }

    }

    public void runMenu(location location) {

        location.onLocation(true);
    }

    public void locChange(int menuSelection){
        curentlLocation=locations[menuSelection-1];

    }

    public void menuSelect(Player player) {

        System.out.println(
                "Gitmek istediğiniz alani seçiniz:\n1-)SafeHouse\n2-)Tool Store\n3-)Forest\n4-)Cave\n5-)River\n--------------------------------------------------------");
        int menuSelection = scanner.nextInt();
        // location selectedLocation = locations[menuSelection - 1];

        locChange(menuSelection);

        curentlLocation.onLocation(true);

        // switch (menuSelection) {
        //     case 1:
        //         // runMenu(selectedLocation);


        //         break;

        //     case 2:
        //         runMenu(selectedLocation);
        //         break;

        //     case 3:
        //         runMenu(selectedLocation);
        //         break;

        //     case 4:
        //         runMenu(selectedLocation);
        //         break;
        //     case 5:
        //         runMenu(selectedLocation);
        //         break;

        // }

    }

    public location[] getLocations() {
        return locations;
    }

    public void setLocations(location[] locations) {
        this.locations = locations;
    }

   

    public Player getPlayer() {
        return player;
    }

    public void setPlayer(Player player) {
        Game.player = player;
    }

}
