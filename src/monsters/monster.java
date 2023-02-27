package monsters;

public class monster {
    String name;
    int id,damage,healthy,money;

    
    public monster(String name, int id, int damage, int healthy, int money) {
        setName(name);
        setId(id);
        setDamage(damage);
        setHealthy(healthy);
        setMoney(money);
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public int getDamage() {
        return damage;
    }
    public void setDamage(int damage) {
        this.damage = damage;
    }
    public int getHealthy() {
        return healthy;
    }
    public void setHealthy(int healthy) {
        this.healthy = healthy;
    }
    public int getMoney() {
        return money;
    }
    public void setMoney(int money) {
        this.money = money;
    }
   
}
