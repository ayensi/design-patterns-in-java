package org.designpattern;

import org.designpattern.model.Enemy;

public class Main {
    public static void main(String[] args) {
        Enemy enemy = new Enemy("skeleton",100,1500,7,200);
        System.out.println(enemy.toString());

        Enemy enemy1 = enemy.clone();
        System.out.println(enemy1.toString());

    }
}