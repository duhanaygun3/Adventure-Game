package chracters;

public class chivalry extends character{

    chivalry() {
        super(3, "Chivalry", 8, 24,5);
        
    }
    @Override
    public String toString() {
        return "Name:"+getName()+" Damage:"+getDamage()+" Healthy:"+getHealthy()+" Money:"+getMoney();

    }
}
