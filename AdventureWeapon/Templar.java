public class Templar extends Character implements Healer, Tank {
    private final int healCapacity;
    private final int shield;

    public Templar(String name, int maxHealth, int healCapacity, int shield, Weapon weapon) {
        super(name, maxHealth, weapon);
        this.healCapacity = healCapacity;
        this.shield = shield;
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
    public int getShield() {
        return this.shield;
    }

    @Override
    public String toString() {
        return String.format("He has the weapon %s", this.getWeapon().toString());
    }

    @Override
    public void takeDamage(int take) {
        take -= this.shield;
        if (take > this.getCurrentHealth()) {
            this.setCurrentHealth(0);
            return;
        }
        this.setCurrentHealth(this.getCurrentHealth() - take);

    }

    @Override
    public void attack(Character other) {
        if (this.getWeapon().getDamage() != 0) {
            other.takeDamage(this.getWeapon().getDamage());
        } else {
            other.takeDamage(6);

        }
    }
    /*
     * abstract void takeDamage(int take) {
     * if (take > this.getCurrentHealth()) {
     * this.currentHealth = 0;
     * return;
     * }
     * this.currentHealth -= take;
     * }
     * 
     * abstract void attack(Character other) {
     * other.takeDamage(9);
     * }
     */
}