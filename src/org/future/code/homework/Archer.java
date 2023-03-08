package org.future.code.homework;

public class Archer extends Person{
    public Archer(String name) {
        super(name, 12, 120);
    }

    @Override
    public String emotion(String name) {
        return super.emotion(name);
    }

    @Override
    public String announce() {
        return super.announce();
    }

    @Override
    public void takeDamage(Integer damage) throws ExceptionForDamage, ExceptionForHealth, PersonDead {
        setHealth(getHealth() - (damage - getProtection() + getHealth() % 10));
    }

    public Integer shootBow() {
        return 40 + getHealth() % 10;
    }

}