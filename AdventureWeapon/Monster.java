public class Monster extends Character {
    public Monster(String name, int maxHealth, Weapon weapon) {
        super(name, maxHealth, weapon);
    }

    @Override
    public String toString() {
        return String.format("He has the weapon %s", this.getWeapon().toString());
    }

    @Override
    public void takeDamage(int take) {
        int reduced = (int) (take * 80 / 100);

        if (reduced >= this.getCurrentHealth()) {
            this.setCurrentHealth(0);
        } else {
            this.setCurrentHealth(this.getCurrentHealth() - reduced);
        }
    }

    @Override
    public void attack(Character other) {
        if (this.getWeapon().getDamage() != 0) {
            other.takeDamage(this.getWeapon().getDamage());
        } else {
            other.takeDamage(7);

        }
    }
}
