import java.util.ArrayList;
import java.util.List;

public class Character {
    private final int maxHealth;
    private int currentHealth;
    private final String name;
    private static List<Character> allCharacters = new ArrayList<>();

    public Character(String name, int maxHealth) {
        this.name = name;
        this.maxHealth = maxHealth;
        this.currentHealth = maxHealth;
        allCharacters.add(this);
    }

    public static String printStatus() {
        String res = "------------------------------------------\n";
        if (allCharacters.size() != 0) {
            res += "Characters currently fighting :\n";
            for (Character ch : allCharacters) {
                res += " - "+ch.toString() + "\n";
            }
            return res + "------------------------------------------";
        }

        res += "Nobody's fighting right now !\n" +
                "------------------------------------------";
        return res;
    }

    public static Character fight(Character first, Character Second) {
        while (first.getCurrentHealth() != 0 && Second.getCurrentHealth() != 0) {
            first.attack(Second);
            if (Second.getCurrentHealth() == 0) {
                return first;
            }

            Second.attack(first);
            if (first.getCurrentHealth() == 0) {
                return Second;
            }
        }
        if (Second.getCurrentHealth() == 0) {
            return first;
        }
        return Second;

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
        return String.format("%s : %d/%d", this.getName(), this.getCurrentHealth(), this.getMaxHealth());
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
