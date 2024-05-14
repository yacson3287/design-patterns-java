package org.designpatterns.structural.flyweight;

public class Detective implements Enemy{
    private String weapon;
    private final String LIFE;


    public Detective() {
        LIFE = "800";
    }

    @Override
    public void setWeapon(String weapon) {
        this.weapon = weapon;
    }

    @Override
    public void lifePoints() {
        System.out.println("The life a lieutenant is: " + LIFE);
    }
}
