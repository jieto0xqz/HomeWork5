public class Tester extends Character {
    static class CharacterCreationException extends Exception {}
    public Tester(String name, int age, int health, int level) throws CharacterCreationException {
        super(name, age, health, level);
        if (!name.equals("Test")) {
            throw new CharacterCreationException();
        }
    }
}
