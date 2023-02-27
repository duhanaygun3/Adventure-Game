package mains;

import location.location;
import location.safehouse;

public class Main {
    public static void main(String[] args) throws Exception {

        location location=new safehouse();

        Player p1=new Player("Duhan",location);
        Game g1=new Game(p1);
        g1.start();
        
    }
}
