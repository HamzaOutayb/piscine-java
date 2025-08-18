public class Character {
    public  final int maxHealth;
    public int currentHealth;
    public  final String name;

    public Character(String name, int maxHealth) {
        this.name = name;
        this.maxHealth = maxHealth;
        this.currentHealth = maxHealth;
    }
    public String getName() {
        return this.name;
    }
    public int getmaxHealth() {
        return this.maxHealth;
    }
    public int getcurrentHealth() {
        return this.currentHealth;
    }
    @Override
    public String toString() {
        if (this.currentHealth == 0) {
            return String.format("%s : KO", this.getName());
        }
        return String.format("%s : %d/%d", this.getName(), this.getcurrentHealth(),this.getmaxHealth());
    }

    public void takeDamage(int take) {
        if (take > this.getcurrentHealth()) {
            this.currentHealth = 0;
            return;
        }
        this.currentHealth -= take;
    }

    public void attack(Character other) {
        other.takeDamage(9);
    }
}
