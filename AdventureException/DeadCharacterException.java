public class DeadCharacterException extends Exception {
    Character character;

    public DeadCharacterException(Character c) {
        this.character = c;
    }

    @Override
    public String getMessage() {
        if (character instanceof Monster) {
            return String.format("The monster %s is dead.", character.getName());
        } else if (character instanceof Templar) {
            return String.format("The templar %s is dead.", character.getName());
        }
        return String.format("The sorcerer %s is dead.", character.getName());
    }
}
