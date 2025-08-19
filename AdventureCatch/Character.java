import java.util.ArrayList;
import java.util.List;

public abstract class Character {
    private final int maxHealth;
    private int currentHealth;
    private final String name;
    private static List<Character> allCharacters = new ArrayList<>();
    private Weapon weapon;

    public Character(String name, int maxHealth, Weapon weapon) {
        this.name = name;
        this.maxHealth = maxHealth;
        this.currentHealth = maxHealth;
        allCharacters.add(this);
        this.weapon = weapon;
    }

    public static String printStatus() {
        if (allCharacters.size() == 0) {
            return "------------------------------------------\nNobody's fighting right now !\n------------------------------------------\n";
        }
        String result = "------------------------------------------\n";
        result += "Characters currently fighting :\n";
        for (Character ch : Character.allCharacters) {
            result += String.format(" - %s\n", ch.toString());
        }
        result += "------------------------------------------\n";
        return result;
    }

    public static Character fight(Character first, Character Second) {
        while (first.getCurrentHealth() != 0 && Second.getCurrentHealth() != 0) {
            try {
                first.attack(Second);
                if (Second.getCurrentHealth() == 0) {
                    break;
                }
                
                Second.attack(first);
                if (first.getCurrentHealth() == 0) {
                    break;
                }
            } catch (DeadCharacterException d) {
                return first;
            }
     
        }
        if (Second.getCurrentHealth() == 0) {
            return first;
        }
        return Second;

    }

    public Weapon getWeapon() {
        return weapon;
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

    protected void setCurrentHealth(int currentHealth) {
        this.currentHealth = currentHealth;
    }

    @Override
    public String toString() {
        return String.format("He has the weapon %s", this.getWeapon().toString());
    }

    public abstract void takeDamage(int take) throws DeadCharacterException;

    public abstract void attack(Character other) throws DeadCharacterException;
}