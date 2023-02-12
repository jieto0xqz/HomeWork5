public class Archer extends Character {
    private int arrows; // кол-во стрел
    public Archer(String name, int age, int health, int arrows) {
        super(name, age, health, arrows);
        this.arrows = arrows;
    }

    @Override
    public String talk() {

        return getName() + ":" + " " + "Лук - лучшее оружие!";

    }

    public int getArrows() {
        return arrows;
    }

    public void setArrows(int arrows) {
        this.arrows = arrows;
    }
}