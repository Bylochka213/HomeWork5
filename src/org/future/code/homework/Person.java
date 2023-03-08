package org.future.code.homework;

public class Person {
    private String name = "Human";
    private int protection = 0;
    private int health = 50;

    protected Person(String name, int protection, int health) {
        this.name = name;
        this.protection = protection;
        this.health = health;
    }

    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getProtection() {
        return protection;
    }

    public void setProtection(int protection) {
        this.protection = protection;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public String announce() {
        return "Person " + name + " имеет характеристики: " + health + " здоровья и " + protection + " защиты";
    }

    public String emotion(String name) {
        return name + " smile";
    }

    public void takeDamage(Integer damage) throws ExceptionForDamage, ExceptionForHealth, PersonDead {
        if (damage >= 0) {
            System.out.println("Damage is take");
            switch (getName()) {
                case ("NameMage"):
                    health = health - (damage - protection - health % 10);
                    break;
                case ("NameArcher"):
                    health = health - (damage - protection + health % 10);
                    break;
                default:
                    health = health - (damage - protection);
                    break;
            }
            if (health >= 0) {
                if (health == 0) {
                    throw new PersonDead("Person is dead");
                } else {
                    System.out.println("Person still alive");
                }
            } else {
                throw new ExceptionForHealth("Health not been < 0");
            }
        } else {
            throw new ExceptionForDamage("Damage not been < 0");
        }
    }

    public int facePunch() {
        return 1;
    }
}
