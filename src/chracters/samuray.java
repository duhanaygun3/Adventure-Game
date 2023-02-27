package chracters;

public class samuray extends character {

    samuray() {
        super(1,"Samuray", 5, 21, 15);
       
    }
    @Override
    public String toString() {
        return "Name:"+getName()+" Damage:"+getDamage()+" Healthy:"+getHealthy()+" Money:"+getMoney();
    }
}
