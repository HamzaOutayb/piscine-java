public class Weapon {
    private String name;
    private int damage;

    public Weapon(String name, int damage) {
        this.name = name;
        this.damage = damage;
    }

    public int getDamage() {
        return damage;
    }
    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return String.format("%s deals %d damages", this.getName(), this.getDamage());
    }
}
