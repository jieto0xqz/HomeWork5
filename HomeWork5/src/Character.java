
public class Character {
    // 3 поля
    private String name; // имя персонажа
    private int age; // возраст персонажа
    private int health; // здоровье персонажа
    private int maxHealth; // максмимальное здоровье персонажа
    private int level; // максмимальное здоровье персонажа

    public Character(String name, int age, int health, int level) {
        this.name = name;
        this.age = age;
        this.health = health;
        this.maxHealth = health;
        this.level = level;
    }

    public String talk() {
        return getName() + ":" + " " + "Готов сражаться!";

    }

    public void heal() {
        setHealth(getMaxHealth());
    }

    public void damage(int damage) {
        setHealth(getHealth() - damage * getLevel());
    }

    public void attack(Character character, int damage) {
        character.setHealth(character.getHealth() - damage);
    }

    // Геттеры и сеттеры

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public int getHealth() {
        return health;
    }

    public int getMaxHealth() {
        return maxHealth;
    }

    public int getLevel() {
        return level;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public void setMaxHealth(int maxHealth) {
        this.maxHealth = maxHealth;
    }

    public void setLevel(int level) {
        this.level = level;
    }
}