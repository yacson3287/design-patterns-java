package org.designpatterns.structural.flyweight;

import java.util.HashMap;

public class EnemyFactory {

    private static final String PRIVATE = "private";
    private static final String DETECTIVE = "detective";

    private static HashMap<String, Enemy> enemys = new HashMap<>();

    public static Enemy getEnemy(String type) {
        Enemy enemy = null;
        if (enemys.containsKey(type)) {
            enemy = enemys.get(type);
        } else {
            switch (type) {
                case PRIVATE -> {
                    enemy = new Private();
                    System.out.println("The soldier was create");
                }
                case DETECTIVE -> {
                    enemy = new Detective();
                    System.out.println("The lieutenant was create");
                }
                default -> throw new IllegalStateException("Unexpected value: " + type);
            }
        }
        enemys.put(type, enemy);
        return enemy;
    }

}
