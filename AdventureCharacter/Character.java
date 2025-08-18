public class Character {
    private  final int maxHealth;
    private int currentHealth;
    private  final String name;

    public Character(String name, int maxHealth) {
        this.name = name;
        this.maxHealth = maxHealth;
        this.currentHealth = maxHealth;
    }
    public String getName() {
        return this.name;
    }
    public int getMaxHealth() {
        return this.maxHealth;
    }
    public int getCurrentHealth() {
        return this.currentHealth;
    }
    @Override
    public String toString() {
        if (this.currentHealth == 0) {
            return String.format("%s : KO", this.getName());
        }
        return String.format("%s : %d/%d", this.getName(), this.getCurrentHealth(),this.getMaxHealth());
    }

    public void takeDamage(int take) {
        if (take > this.getCurrentHealth()) {
            this.currentHealth = 0;
            return;
        }
        this.currentHealth -= take;
    }

    public void attack(Character other) {
        other.takeDamage(9);
    }
}
