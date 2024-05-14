package org.designpatterns.structural.flyweight;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Random;

class FlyweightTest {

    private String[] enemyType;
    private String[] weapon;

    @BeforeEach
    void setUp() {
        enemyType = new String[]{"private", "detective"};
        weapon = new String[]{"rifle", "gun", "machine gun", "grenade launcher"};
    }

    @Test
    public void enemyFactoryTest() {
        for (int i = 0; i < 15; i++) {
            Enemy enemy = EnemyFactory.getEnemy(getRandomEnemyType());
            enemy.setWeapon(getRandomWeapon());
            enemy.lifePoints();
        }
    }

    private String getRandomEnemyType() {
        Random r = new Random();
        int randInt = r.nextInt(enemyType.length);
        return enemyType[randInt];
    }

    private String getRandomWeapon() {
        Random r = new Random();
        int randInt = r.nextInt(weapon.length);
        return weapon[randInt];
    }


}