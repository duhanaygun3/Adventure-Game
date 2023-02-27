package location;

import mains.Player;

public abstract class location {
    Player player;
    String name;
    
    
    public abstract boolean onLocation(boolean bool);
    
}
