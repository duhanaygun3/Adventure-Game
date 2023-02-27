package weapon;
public class weapon {
    String name;
    int id,damage,money;

    
    public weapon(String name, int id, int damage, int money) {
        setId(id);
        setName(name);
        setDamage(damage);
        setPara(money);
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
    public int getPara() {
        return money;
    }
    public void setPara(int para) {
        this.money = para;
    }

    
}
