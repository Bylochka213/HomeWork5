package org.future.code.homework;

public class Mage extends Person {

    public Mage(String name) {
        super(name, 15,100);
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
       super.takeDamage(damage);
    }

    public int fireBall() {
        return 45;
    }
}