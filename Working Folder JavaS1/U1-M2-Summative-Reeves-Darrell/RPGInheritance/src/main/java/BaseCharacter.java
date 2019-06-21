public class BaseCharacter {
    private String name;
    private int strength;
    private int health;
    private int stamina;
    private int speed;
    private int attackPower;


    public BaseCharacter() {

    }


    public BaseCharacter(String name, int strength, int health, int stamina, int speed, int attackPower) {
        this.name = name;
        this.strength = strength;
        this.health = health;
        this.stamina = stamina;
        this.speed = speed;
        this.attackPower = attackPower;
    }

    public void run(){

    }

    public void attack(){

    }

    public void heal(){

    }

    public void decreaseHealth(){

    }

    public void increaseStamina(){

    }

    public void decreaseStamina(){

    }
}
