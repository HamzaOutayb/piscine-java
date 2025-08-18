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

    @Override
    public String toString() {
        if (this.currentHealth == 0) {
            return String.format("%s : KO", this.name);
        }
        return String.format("%s : %d/%d", this.name, this.currentHealth,this.maxHealth);
    }

    public void takeDamage(int take) {
        if (take > currentHealth) {
            this.currentHealth = 0;
            return;
        }
        this.currentHealth -= take;
    }

    public void attack(Character other) {
        other.takeDamage(9);
    }
}
