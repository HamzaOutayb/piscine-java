public class Monster extends Character {
    public Monster(String name, int maxHealth, Weapon weapon) {
        super(name, maxHealth, weapon);
    }

    @Override
    public String toString() {
        if (this.getCurrentHealth() != 0) {
            return String.format("%s is a monster with %d HP", this.getName(), this.getCurrentHealth())+String.format(". He has the weapon %s", this.getWeapon().toString());
        }
        return String.format("%s is a monster and is dead", this.getName())+String.format(". He has the weapon %s", this.getWeapon().toString());
    }

    @Override
    public void takeDamage(int take) throws DeadCharacterException {
        int reduced = (int) (take * 80 / 100);

        if (reduced >= this.getCurrentHealth()) {
            this.setCurrentHealth(0);
            throw new DeadCharacterException(this);
        } else {
            this.setCurrentHealth(this.getCurrentHealth() - reduced);
        }
    }

    @Override
    public void attack(Character other) throws DeadCharacterException {
        try {
            if (this.getWeapon().getDamage() != 0) {
                other.takeDamage(this.getWeapon().getDamage());
            } else {
                other.takeDamage(7);
                
            }
        } catch (DeadCharacterException d) {
            throw d;
        }
    }
}
