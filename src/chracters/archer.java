package chracters;

public class archer extends character {

    archer() {
        super(2, "Archer", 7, 18, 200);

    }

    @Override
    public String toString() {
        return "Name:"+getName()+" Damage:"+getDamage()+" Healthy:"+getHealthy()+" Money:"+getMoney();

    }

}