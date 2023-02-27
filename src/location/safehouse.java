package location;

import mains.Game;
import mains.Player;


public class safehouse extends normal_loc {

    

    @Override
    public boolean onLocation(boolean bool) {
       Player.player.getPlayer_Character().setHealthy(Game.choosen.getHealthy());
        System.out.println("Caniniz yenilendi\n---------------------------");
        System.out.println("Your current HEALTH: "+Player.player.getPlayer_Character().getHealthy());
       
        return true;
        
    }
    
}
