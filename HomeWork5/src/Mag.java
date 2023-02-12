
public class Mag extends Character {
    private int mana; // мана
    public Mag(String name, int age, int health, int mana) {
        super(name, age, health, mana);
        this.mana = mana;
    }

    @Override
    public String talk() {
        return getName() + ":" + " " + "Мой посох не победим!";
    }

    public int getMana() {
        return mana;
    }

    public void setMana(int mana) {
        this.mana = mana;
    }
}