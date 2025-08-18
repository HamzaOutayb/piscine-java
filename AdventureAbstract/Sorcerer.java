public class Sorcerer extends Character implements Healer {
    private final int healCapacity;

    public Sorcerer(String name, int maxHealth, int healCapacity) {
        super(name, maxHealth);
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
        if (this.getCurrentHealth() == 0) {
            return String.format("%s is a dead sorcerer. So bad, it could heal %d HP.", this.getName(),
                    this.getHealCapacity());
        }
        return String.format("%s is a sorcerer with %d HP. It can heal %d HP.", this.getName(), this.getCurrentHealth(),
                this.getHealCapacity());
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
        this.heal(this);
        other.takeDamage(10);
    }

}
