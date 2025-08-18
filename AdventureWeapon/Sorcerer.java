public class Sorcerer extends Character implements Healer {
    private final int healCapacity;

    public Sorcerer(String name, int maxHealth, int healCapacity, Weapon weapon) {
        super(name, maxHealth, weapon);
        this.healCapacity = healCapacity;
    }

    @Override
    public int getHealCapacity() {
        return this.healCapacity;
    }

    @Override
    public void heal(Character c) {
        if (c.getCurrentHealth() + getHealCapacity() <= c.getMaxHealth()) {
            c.setCurrentHealth(c.getCurrentHealth() + getHealCapacity());
        } else {
            c.setCurrentHealth(c.getMaxHealth());
        }
    }

    @Override
    public String toString() {
        return String.format("He has the weapon %s", this.getWeapon().toString());
    }

    @Override
    public void takeDamage(int take) {
        if (take > this.getCurrentHealth()) {
            this.setCurrentHealth(0);
            return;
        }
        this.setCurrentHealth(this.getCurrentHealth()-take);
    }
    @Override
    public void attack(Character other) {
        if (this.getWeapon().getDamage() != 0) {
            other.takeDamage(this.getWeapon().getDamage());
        } else {
            other.takeDamage(10);

        }
    }

}
