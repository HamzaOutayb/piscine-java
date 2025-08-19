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
    public void heal(Character c) throws DeadCharacterException {
        if (this.getCurrentHealth() == 0) {
            throw new DeadCharacterException(this);
        }
        if (c.getCurrentHealth() == 0) {
            throw new DeadCharacterException(c);
        }
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
                    this.getHealCapacity()) + String.format(" He has the weapon %s", this.getWeapon().toString());
        }
        return String.format("%s is a sorcerer with %d HP. It can heal %d HP.", this.getName(), this.getCurrentHealth(),
                this.getHealCapacity()) + String.format(" He has the weapon %s", this.getWeapon().toString());
    }

    @Override
    public void takeDamage(int take) throws DeadCharacterException {
        if (this.getCurrentHealth() == 0)
            throw new DeadCharacterException(this);

        if (take > this.getCurrentHealth()) {
            this.setCurrentHealth(0);
        }
        this.setCurrentHealth(this.getCurrentHealth() - take);
        if (this.getCurrentHealth() == 0)
            throw new DeadCharacterException(this);

    }

    @Override
    public void attack(Character other) throws DeadCharacterException {
        if (this.getCurrentHealth() == 0) {
            throw new DeadCharacterException(this);
        }
        this.heal(this);
        if (this.getWeapon().getDamage() != 0) {
            other.takeDamage(this.getWeapon().getDamage());
        } else {
            other.takeDamage(10);

        }

    }

}
